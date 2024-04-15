package com.survey.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.survey.entity.ParticipantMid;

public interface ParticipantMidRepository   extends JpaRepository<ParticipantMid, Long> {

	List<ParticipantMid> findAll();

	boolean existsById(Long id);

	Optional<ParticipantMid> findById(Long id);

	ParticipantMid save(ParticipantMid participant);

	void deleteById(Long id);

}
