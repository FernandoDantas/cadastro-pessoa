package br.fernando.teste.kumulus.bean;

import javax.faces.bean.ManagedBean;

import org.omnifaces.util.Messages;

@ManagedBean
public class EstadoBean {
	public void salvar(){
		Messages.addGlobalInfo("Programação Web com Java");
	}
}