package com.survey.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.entity.ParticipantSmall;

public interface ParticipantSmallRepository   extends JpaRepository<ParticipantSmall, Long> {

	List<ParticipantSmall> findAll();

	boolean existsById(Long id);

	Optional<ParticipantSmall> findById(Long id);

	ParticipantSmall save(ParticipantSmall participant);

	void deleteById(Long id);

}
