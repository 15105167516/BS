package com.suke.communitymanage.service;

import com.suke.communitymanage.bean.Member;
import com.suke.communitymanage.bean.MemberExample;

import com.suke.communitymanage.dao.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberMapper memberMapper;
    public Member hasMember(String memberId) {
      return   memberMapper.selectByPrimaryKey(memberId);
    }

    public boolean checkId(String memberId) {

        MemberExample memberExample=new MemberExample();
        MemberExample.Criteria criteria = memberExample.createCriteria();
        criteria.andMemberIdEqualTo(memberId);
        long count =memberMapper.countByExample(memberExample);
        return count==0;
    }

    public void save_member(Member member) {
        memberMapper.insert(member);
    }
}
