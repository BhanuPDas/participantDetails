/**
 * 
 */
package com.fhdortmund.precheckAssignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fhdortmund.precheckAssignment.model.Participant;

/**
 * This class fetches participant details based on number of awards and type of
 * awards
 *
 */

public class FetchParticipant {

	public List<Participant> getParticipantDetails(List<Participant> participant, String sportType, String awardType,
			int numberOfAward) {
		List<Participant> participantDetails = new ArrayList<Participant>();
		participantDetails = participant.stream()
				.filter(pr -> pr.getSportType().equals(sportType) && (pr.getAwards().stream()
						.anyMatch(aw -> aw.getAwardType().equals(awardType) && aw.getNumbeOfAwards() == numberOfAward)))
				.collect(Collectors.toList()); 
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		try {
			System.out.println(mapper.writeValueAsString(participantDetails));
		} catch (JsonProcessingException e) {
			System.out.print("Error encountered when converting object to json");
		}
		return participantDetails;
	}

}
