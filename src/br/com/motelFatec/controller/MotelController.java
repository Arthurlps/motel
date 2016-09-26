package br.com.motelFatec.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.motelFatec.Cardapio;
import br.com.motelFatec.ListaENUM;
import br.com.motelFatec.dao.ClienteDAO;
import br.com.motelFatec.model.Cliente;

@Controller
public class MotelController {
	
	static Logger log = Logger.getLogger(MotelController.class.getName());


    @Autowired
    private ClienteDAO dao;
    
    @RequestMapping("home")
    public String acessarFormDeCadastro() {
    	log.info("Acessando a HOME");

        return "index";
    }
    
    @RequestMapping("/dadosCliente")
    public String dadosCliente(Cliente cpf){
    	
    	System.out.println(dao.consultar(cpf));
    	
    	return "dadosCliente";
    }
    
    @RequestMapping("/consultarClientes")
    public String acessarFormDeCadastro(String nome) {
    	System.out.println("acessou");
    	
        return "index";
    }
    
    @RequestMapping("/clienteCadastrado")
    public ModelAndView cadastrar(Cliente cliente) {
    	log.info("Acessando a HOME");
    	
    	System.out.println(dao.consultar(cliente));

    	dao.gravar(cliente);
    	ModelAndView mv = new ModelAndView("sucesso");
    	mv.addObject("cliente", cliente);

        return mv;
    }
    
    @RequestMapping("/cardapio")
    public ModelAndView cardapio() {
	ModelAndView model = new ModelAndView("cardapio");
		model.addObject("cardapio", new ListaENUM().listarCardapio());
	return model;
    }
    
    @RequestMapping("/quarto")
    public ModelAndView quarto() {
	ModelAndView model = new ModelAndView("quarto");
		model.addObject("quarto", new ListaENUM().listarQuarto());
	return model;
    }
    
    @RequestMapping("/cadastrar")
    public String login() {
    	
    	System.out.println("Acessando cadastro");
        return "formularioCadastro";
    }



}
