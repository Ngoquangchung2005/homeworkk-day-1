package Bai7_1;

public class Customer {
	
	    private String name;
	    private boolean member;
	    private String membershipType;

	    public Customer(String name) {
	        this.name = name;
	        this.member = false;
	        this.membershipType = membershipType ;
	    }

	    public Customer(String name, boolean member, String membershipType) {
	        this.name = name;
	        this.member = member;
	        this.membershipType = membershipType;
	    }

	    public String getName() {
	        return name;
	    }

	    public boolean isMember() {
	        return member;
	    }

	    public void setMember(boolean member) {
	        this.member = member;
	    }

	    public String getMembershipType() {
	        return membershipType;
	    }

	    public void setMembershipType(String membershipType) {
	        this.membershipType = membershipType;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" +
	                "name='" + name + '\'' +
	                ", member=" + member +
	                ", membershipType=" + membershipType +
	                '}';
	    }
	}


