package com.yash.ophs.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ophs.dao.DiseaseDao;
import com.yash.ophs.model.Disease;
import com.yash.ophs.service.DiseaseService;

@Service
public class DiseaseServiceImpl implements DiseaseService {
	@Autowired
	DiseaseDao diseaseDao;

	private static final Logger log = Logger.getLogger(DiseaseServiceImpl.class);
	@Override
	public void saveOrUpdate(Disease disease) {
		log.info("svaeOrupdate Function :: Started");
		try {
			
			diseaseDao.save(disease);
		}
		
		catch(Exception e)
		{
			log.error("Error In saveOrUpdate " + e.getStackTrace());
		}

	}

	@Override
	public List<Disease> getAllDiseaseList() {

		return diseaseDao.findAll();
	}

	@Override
	public void delete(int diseaseId) {

		diseaseDao.deleteById(diseaseId);
	}

	@Override
	public void updateDisease(int diseaseId, Disease disease) {
		Optional<Disease> d = diseaseDao.findById(diseaseId);
		if (d.isPresent()) {
			Disease disease1 = d.get();
			disease1.setDiseaseId(diseaseId);
			disease1.setDiseaseName(disease.getDiseaseName());
			diseaseDao.save(disease1);
			System.out.println("Disease updated successfully ...!!!");
		} else {
			System.out.println("Disease id not found ...!!!");
		}
	}

	@Override
	public Optional<Disease> findDiseaseById(int diseaseId) {
		// TODO Auto-generated method stub
		return diseaseDao.findById(diseaseId);
	}
}
