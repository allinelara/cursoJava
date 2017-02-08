package com.alline.cursojavaOO;

public class UtilizarContato {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Hannah");
		
		Endereco end = new Endereco();
		end.setNomeRua("Banana");
		end.setCidade("Bananal");
		end.setEstado("Terra das Bananas");
		
		Telefone tel = new Telefone();
		tel.setDdd("32");
		tel.setNum("09929282");
		tel.setTipo("celular");
		
		Telefone tel2 = new Telefone();
		tel2.setDdd("32");
		tel2.setNum("9999999");
		tel2.setTipo("casa");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;
		contato.setEndereco(end);
		contato.setTelefones(telefones);
		
		if(contato!=null && contato.getEndereco() !=null && contato.getTelefones() != null){
			System.out.println(contato.getNome());
			System.out.println(contato.getEndereco().getCidade());
			for(Telefone t : contato.getTelefones()){
				System.out.println(t.getNum());
			}
		
		}
		
	}

}
