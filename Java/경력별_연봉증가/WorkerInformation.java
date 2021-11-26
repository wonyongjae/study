package mission;

import java.util.ArrayList;

public class WorkerInformation {

	public static Worker searchWorkerInformation(ArrayList<Worker> workers, String number ) {
																//배열과 내가 찾을 값을 받았다. 
		for(int i=0; i<workers.size(); i++) {
			//어레이리스트 안에 있는 모든 개체를 i에 넘겨주겠다.
			String searchNo = workers.get(i).getWorkerNumber(); //i에 넘긴 정보들중에서 또 가져오겠다 사원번호만  그리고 그걸 searchNo에 넣겠따
			if(number.equals(searchNo)) { //찾을 값과 searchNo에  담긴 값을 맞는지 비교하겠다.
				return workers.get(i); //서로 동일한 값을 찾았을 경우, 그 값을  리턴하겠다. 생성자에 넣겠다.
			}

		}
		return null; //동일한 값을 못찾았을 경우, null을 리턴하겠다.
	}
}