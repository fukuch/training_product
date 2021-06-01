package com.voice.fukuchproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.voice.fukuchproduct.entity.Attendance;
import com.voice.fukuchproduct.repository.AttendanceRepository;

@Service
@Transactional
public class AttendanceService {

	

@Autowired
	private AttendanceRepository rep;
	public Attendance save(Attendance attendance) {
		return rep.save(attendance);
	}
	//リスト
	public List<Object[]> innerJoin(){
		List<Object[]> list = rep.find();
		return list;
	}
	
	public Object[] findByInnerJoin(Long attendanceId) {
		return rep.findOne(attendanceId);
	}
	//更新
	public Attendance findOne(Long attendanceId) {
		return rep.getOne(attendanceId);
	}
	//削除
	public void delete(Long attendanceId) {
       Attendance attendance =findOne(attendanceId);
		rep.delete(attendance);
    }
}