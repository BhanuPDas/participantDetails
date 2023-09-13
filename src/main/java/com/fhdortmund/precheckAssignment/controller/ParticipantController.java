package com.fhdortmund.precheckAssignment.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.fhdortmund.precheckAssignment.model.Participant;
import com.fhdortmund.precheckAssignment.service.FetchParticipant;

@Controller
public class ParticipantController {

	public List<Participant> getParticipants(List<Participant> participant, String sportType, String awardType,
			int numberOfAward) {
		
		FetchParticipant fetchParticipant = new FetchParticipant();
		return fetchParticipant.getParticipantDetails(participant, sportType, awardType, numberOfAward);

	}

}
