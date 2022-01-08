package com.cg.marketplace.util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cg.marketplace.dto.CourseDetails;
import com.cg.marketplace.dto.EmployeeDetails;
import com.cg.marketplace.dto.OfferDetails;
import com.cg.marketplace.dto.ProposalDetails;
import com.cg.marketplace.dto.RequirementDetails;
import com.cg.marketplace.dto.StudentDetails;
import com.cg.marketplace.entities.Course;
import com.cg.marketplace.entities.Employee;
import com.cg.marketplace.entities.Offer;
import com.cg.marketplace.entities.Proposal;
import com.cg.marketplace.entities.Requirement;
import com.cg.marketplace.entities.Student;

@Component
public class MarketPlaceUtil {
	public OfferDetails toDetails(Offer offer) {
		List<Proposal> proposals = offer.getProposals();
		List<ProposalDetails> details = new ArrayList<>();
		for (Proposal proposal : proposals) {
			details.add(new ProposalDetails(proposal));
			
		}
		return new OfferDetails(offer.getOfferId(),offer.isAvailable(),offer.getAvailableUpto(),details);
		}
	public List<OfferDetails> toDetails(Collection<Offer> offers){
		List<OfferDetails> detailList = new ArrayList<>();
		for(Offer offer: offers) {
			OfferDetails details = toDetails(offer);
			System.out.println(details);
			detailList.add(details);
		}
		return detailList;
		
		
		
}

	public RequirementDetails toDetail(Requirement requirement) {
		List<Proposal> proposals = requirement.getProposals();
		List<ProposalDetails> details = new ArrayList<>();
		for (Proposal proposal : proposals) {
			details.add(new ProposalDetails(proposal));
			
		}
		return new RequirementDetails(requirement.getReqId(),requirement.isFulfilled(),requirement.getFulfilledOn(),details);
		}
	
	public List<RequirementDetails> toDetail(Collection<Requirement> requirements){
		List<RequirementDetails> detailList = new ArrayList<>();
		for (Requirement requirement : requirements) {
			RequirementDetails details = toDetail(requirement);
			System.out.println(details);
			detailList.add(details);
		}
		return detailList;
	}
//public StudentDetails toDetails(Student student) 
//		Set<Course> courses = student.getCourses();
//		Set<CourseDetails> details = new HashSet<>();
//		// to prevent cyclic reference to student in course when json is created
//		for (Course course : courses) {
//			details.add(new CourseDetails(course));
//		}
//		return new StudentDetails(student.getId(), student.getFirstName(), 
//        				student.getLastName(), student.getAge(), details);
//    }
//	public List<StudentDetails> toDetails(Collection<Student> students) {
//        List<StudentDetails> detailList = new ArrayList<>();
//        for (Student student : students) {
//            StudentDetails details = toDetails(student);
//            System.out.println(details);
//            detailList.add(details);
//        }
//        return detailList;
//    }

}
