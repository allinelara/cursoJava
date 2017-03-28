package Map;

import java.util.HashMap;
import java.util.Map;

public class UtilizandoMaP {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java")){
			System.out.println("Java já existe.");
		}else{
			//adiciona um item no Map
			languages.put("Java","curso de java");
		}
		languages.put("Python", "curso de python");
		languages.put("Javascript", "curso de javascript");
		languages.put("CSS", "curso de CSS");
		languages.put("Angular", "curso de angular");
		languages.put("Ruby", "curso de ruby");
		//verifica se já existe a chave no Map
		if(languages.containsKey("Java")){
			System.out.println("Java já existe.");
		}else{
			languages.put("Java","curso de java avançado");
		}
		//exibiir os itens do Map
		for(String key : languages.keySet()){
			System.out.println(key +":  "+ languages.get(key));
		}
		//removendo o item pela chave
		languages.remove("CSS");
		
		//substituindo valores 
		languages.replace("Java", "novo curso de java");
		
		System.out.println(languages.get("Java"));
		
	}

}
