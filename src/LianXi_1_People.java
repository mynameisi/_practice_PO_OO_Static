
public class LianXi_1_People {
	public static void main(String[] args){
		//1. ����һ������ı��� zs��ʹ������������"����"���Ա���"��"�������"1.75��", �����˿���60��

		//2. ���÷���ʵ�ִ�ӡ������˯�崲

		//3. ���÷���ʵ�ִ�ӡ�������Դ���

		//4. ���þ�̬��������ӡ���Ա���

		//5. ���þ�̬��������ӡȫ������6 billion�˿�

	}
}


/**
 * People��
 * @author Administrator
 *
 */
class People{
	String name;//����
	String gender;//�Ա�
	String height;//���
	static String worldPopulation;//�����˿�
	
	void eat(String food){
		System.out.println(name+"��"+food);
	}
	void sleep(String bed){
		System.out.println(name+"˯"+bed);
	}
	static void good(){
		System.out.println("���Ա���");
	}
}
