package com.and.luc.sil.api.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {
	/**
	* Gera um hash utilizando o BCrypt.
	* @param senha
	* @return String
	*/
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
	
	/**
	* Verifica se a senha é válida.
	* @param senha
	* @param senhaEncoded
	* @return boolean
	*/
	public static boolean senhaValida(String senha, String senhaEncode) {
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.matches(senha, senhaEncode);
	}
}
