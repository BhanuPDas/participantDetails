package com.fhdortmund.precheckAssignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fhdortmund.precheckAssignment.model.Awards;
import com.fhdortmund.precheckAssignment.model.Participant;

public class ParticipantControllerTest {

	@Test
	public void getParticipant1Test() {
		ParticipantController pc = new ParticipantController();

		Awards award1 = new Awards("National", 1);
		Awards award2 = new Awards("National", 2);
		Awards award3 = new Awards("National", 3);
		Awards award4 = new Awards("International", 4);
		Awards award5 = new Awards("National", 5);
		Awards award6 = new Awards("International", 6);
		Awards award7 = new Awards("National", 7);
		Awards award8 = new Awards("International", 8);
		Awards award9 = new Awards("National", 9);
		Awards award10 = new Awards("International", 10);

		List<Awards> list1 = new ArrayList<Awards>();
		list1.add(award1);
		list1.add(award2);
		List<Awards> list2 = new ArrayList<Awards>();
		list2.add(award3);
		list2.add(award4);
		List<Awards> list3 = new ArrayList<Awards>();
		list3.add(award5);
		list3.add(award6);
		List<Awards> list4 = new ArrayList<Awards>();
		list4.add(award7);
		list4.add(award8);
		List<Awards> list5 = new ArrayList<Awards>();
		list5.add(award9);
		list5.add(award10);

		Participant part1 = new Participant("Test1", "Surname1", 10, "Cricket", list1);
		Participant part2 = new Participant("Test2", "Surname2", 11, "Cricket", list2);
		Participant part3 = new Participant("Test3", "Surname3", 12, "Cricket", list3);
		Participant part4 = new Participant("Test4", "Surname4", 13, "Football", list4);
		Participant part5 = new Participant("Test5", "Surname5", 14, "Football", list5);

		Participant pr[] = new Participant[5];
		pr[0] = part1;
		pr[1] = part2;
		pr[2] = part3;
		pr[3] = part4;
		pr[4] = part5;

		List<Participant> pl = new ArrayList<Participant>();

		for (Participant p : pr) {
			pl.add(p);
		}

		Assertions.assertNotNull(pc.getParticipants(pl, "Football", "National", 9));

	}

}
