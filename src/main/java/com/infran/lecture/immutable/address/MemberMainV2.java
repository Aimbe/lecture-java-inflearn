package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        lang.immutable.address.ImmutableAddress address = new lang.immutable.address.ImmutableAddress("서울");

        lang.immutable.address.MemberV2 memberA = new lang.immutable.address.MemberV2("홍길동", address);
        lang.immutable.address.MemberV2 memberB = new lang.immutable.address.MemberV2("김길동", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        final lang.immutable.address.ImmutableAddress memberBAddress = memberB.getAddress();
        System.out.println("==============");
        // memberBAddress.setValue("부산"); -> 컴파일 에러
        memberB.setAddress(new lang.immutable.address.ImmutableAddress("부산"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }

}
