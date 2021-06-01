package com.voice.fukuchproduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.voice.fukuchproduct.entity.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance,Long>{

	public Attendance getOne(Long attendanceId);
	
	@Query(value="SELECT attendance_id,attendance.member_id,name,work_division,date,punch_in,punch_out,break_time,attendance.remarks FROM attendance INNER JOIN member ON attendance.member_id = member.member_id" ,nativeQuery = true)
	public List<Object[]> find();
	
	@Query(value="SELECT attendance_id,attendance.member_id,name,work_division,date,punch_in,punch_out,break_time,attendance.remarks FROM attendance INNER JOIN member ON attendance.member_id = member.member_id AND attendance.attendance_id=?1",nativeQuery = true)
	public Object findOne(Long attendanceId);
}