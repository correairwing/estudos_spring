package com.icorrea.servidorpublico.service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icorrea.servidorpublico.model.ServidorPublico;

public class ServidorPublicoServiceImpl implements ServidorPublicoService {

	private final String SERVIDOR = "/data/servidorpublico.json";
	
	@Override
	public List<ServidorPublico> listAll() {
		try {
			
			TypeReference<List<ServidorPublico>> typeref = new TypeReference<List<ServidorPublico>>() {
			};
			
			InputStream inputStream = TypeReference.class.getResourceAsStream(SERVIDOR);
			List<ServidorPublico> servidorPublicos = new ObjectMapper().readValue(inputStream, typeref);
			return servidorPublicos;
			
		} catch (Exception e) {
			System.out.println("Exceção" + e.getMessage());
			return null;
		}
		
		
	}

	@Override
	public Optional<ServidorPublico> listByMatricula(long matricula) {
try {
			
			TypeReference<List<ServidorPublico>> typeref = new TypeReference<List<ServidorPublico>>() {
			};
			
			InputStream inputStream = TypeReference.class.getResourceAsStream(SERVIDOR);
			List<ServidorPublico> servidorPublicos = new ObjectMapper().readValue(inputStream, typeref);
			Optional<ServidorPublico> servidorEncontrado = servidorPublicos.stream().filter(
					servidor -> servidor.matricula().equals(matricula)).findFirst();
					
			return servidorEncontrado;
					
			
		} catch (Exception e) {
			System.out.println("Exceção" + e.getMessage());
			return null;
		}
	}

}
