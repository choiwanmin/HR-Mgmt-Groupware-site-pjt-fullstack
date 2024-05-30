package com.example.demo.members;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.users.UsersDao;

/*
 * ==================================================================
 * 추가 및 전체수정
 * id로 검색
 * 이름으로 검색
 * 전체 검색
 * 부서번호로 검색
 * 직급으로 검색
 * ==================================================================
*/

@Service
public class MembersService {
	@Autowired
	private MembersDao mdao;

	@Autowired
	private UsersDao udao;

	public MembersDto save(MembersDto dto) {
		Members m = mdao.save(new Members(dto.getUserid(), dto.getMemberid(), dto.getBirthdt(), dto.getEmail(),
				dto.getCpnum(), dto.getAddress(), dto.getMemberimgnm(), dto.getHiredt(), dto.getLeavedt(),
				dto.getDeptid(), dto.getJoblv()));
		return new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
				m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(), null);
	}

	public MembersDto getByMemberId(int memberid) {
		Members m = mdao.findById(memberid).orElse(null);
		if (m == null) {
			return null;
		}
		return new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
				m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(), null);
	}

//	public MembersDto getByMemberNm(String membernm) {
//		Members m = mdao.findByName(udao.findByName(membernm).getId());
//		if (m == null) {
//			return null;
//		}
//		return new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
//				m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(), null,
//				null);
//	}

	public ArrayList<MembersDto> getAll() {
		List<Members> l = mdao.findAll();
		ArrayList<MembersDto> list = new ArrayList<>();
		for (Members m : l) {
			list.add(new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
					m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(),
					null));
		}
		return list;
	}

//	public ArrayList<MembersDto> getByDeptId(int deptid) {
//		List<Members> l = mdao.findByDeptId(deptid);
//		ArrayList<MembersDto> list = new ArrayList<>();
//		for (Members m : l) {
//			list.add(new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
//					m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(),
//					null));
//		}
//		return list;
//	}

//	public ArrayList<MembersDto> getByJobLv(int joblv) {
//		List<Members> l = mdao.findByJoblv(joblv);
//		ArrayList<MembersDto> list = new ArrayList<>();
//		for (Members m : l) {
//			list.add(new MembersDto(m.getUserid(), m.getMemberid(), m.getBirthdt(), m.getEmail(), m.getCpnum(),
//					m.getAddress(), m.getMemberimgnm(), m.getHiredt(), m.getLeavedt(), m.getDeptid(), m.getJoblv(),
//					null));
//		}
//		return list;
//	}

}