package mission;

import java.util.ArrayList;

public class WorkerInformation {

	public static Worker searchWorkerInformation(ArrayList<Worker> workers, String number ) {
																//�迭�� ���� ã�� ���� �޾Ҵ�. 
		for(int i=0; i<workers.size(); i++) {
			//��̸���Ʈ �ȿ� �ִ� ��� ��ü�� i�� �Ѱ��ְڴ�.
			String searchNo = workers.get(i).getWorkerNumber(); //i�� �ѱ� �������߿��� �� �������ڴ� �����ȣ��  �׸��� �װ� searchNo�� �ְڵ�
			if(number.equals(searchNo)) { //ã�� ���� searchNo��  ��� ���� �´��� ���ϰڴ�.
				return workers.get(i); //���� ������ ���� ã���� ���, �� ����  �����ϰڴ�. �����ڿ� �ְڴ�.
			}

		}
		return null; //������ ���� ��ã���� ���, null�� �����ϰڴ�.
	}
}