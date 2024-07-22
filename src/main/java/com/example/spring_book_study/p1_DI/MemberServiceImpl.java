package com.example.spring_book_study.p1_DI;

public class MemberServiceImpl implements MemberService {
    private MemberDAO memberDAO;

    public void setMemberDAO(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    @Override
    public void listMembers() {
        memberDAO.listMembers();
    }
}
