package com.survey.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.entity.ParticipantAdult;

public interface ParticipantAdultRepository   extends JpaRepository<ParticipantAdult, Long> {

	List<ParticipantAdult> findAll();

	boolean existsById(Long id);

	Optional<ParticipantAdult> findById(Long id);

	ParticipantAdult save(ParticipantAdult participant);

	void deleteById(Long id);

}
