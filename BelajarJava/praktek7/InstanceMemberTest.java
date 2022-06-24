public class InstanceMemberTest {
	public static void main(String[] args) {
		InstanceMember.nameStatic = "Naufal";
		InstanceMember.ageStatic = 19;

		System.out.println("Class Member");
		System.out.println("nameStatic : " + InstanceMember.nameStatic);
		System.out.println("ageStatic : " + InstanceMember.ageStatic + "\n");

		InstanceMember instMember = new InstanceMember();
		instMember.setName("Naufal fadillah");
		instMember.setAge(19);
		System.out.println("Intance Member");
		System.out.println("Name : " + instMember.getName());
		System.out.println("Age : " + instMember.getAge());
	}
}
