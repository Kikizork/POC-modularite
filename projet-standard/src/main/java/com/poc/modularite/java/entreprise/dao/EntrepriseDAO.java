package com.poc.modularite.java.entreprise.dao;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.poc.modularite.java.entreprise.data.EntrepriseDTO;

@Repository
public class EntrepriseDAO implements IEntrepriseDAO {

	private final EntrepriseRepo entrepriseRepo;

	public EntrepriseDAO(EntrepriseRepo entrepriseRepo) {
		super();
		this.entrepriseRepo = entrepriseRepo;
	}

	@Override
	public List<EntrepriseDTO> findAll() {
		return this.entrepriseRepo.findAll().stream().map(m -> new EntrepriseDTO().modelToDTOWithChildTable(m))
				.toList();
	}

	@Override
	public List<EntrepriseDTO> findAll(Sort sort) {
		return this.entrepriseRepo.findAll(sort).stream().map(m -> new EntrepriseDTO().modelToDTOWithChildTable(m))
				.toList();
	}

	@Override
	public List<EntrepriseDTO> findAllById(Iterable<Integer> ids) {
		return this.entrepriseRepo.findAllById(ids).stream().map(m -> new EntrepriseDTO().modelToDTOWithChildTable(m))
				.toList();
	}

	@Override
	public List<EntrepriseDTO> saveAll(Iterable<EntrepriseDTO> dtos) {
		return this.entrepriseRepo.saveAll(
				StreamSupport.stream(dtos.spliterator(), false).map(d -> d.convertToModelWithChildTable()).toList())
				.stream().map(m -> new EntrepriseDTO().modelToDTOWithChildTable(m)).toList();
	}

	@Override
	public EntrepriseDTO save(EntrepriseDTO dto) {

		return new EntrepriseDTO()
				.modelToDTOWithChildTable(this.entrepriseRepo.save(dto.convertToModelWithChildTable()));
	}

}
