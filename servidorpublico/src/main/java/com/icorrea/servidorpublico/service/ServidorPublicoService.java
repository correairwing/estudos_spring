package com.icorrea.servidorpublico.service;

import java.util.List;
import java.util.Optional;

import com.icorrea.servidorpublico.model.ServidorPublico;

public interface ServidorPublicoService {

	List<ServidorPublico> listAll();
	
	Optional<ServidorPublico> listByMatricula(long matricula);
}
