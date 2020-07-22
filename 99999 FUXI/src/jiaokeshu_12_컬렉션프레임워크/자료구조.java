package jiaokeshu_12_컬렉션프레임워크;

public class 자료구조 {
	
	/*
	 * 1. Array 배열
	 * 선형(일렬로 되어 있는) 자료 구조
	 * fixed-length --> index 연산
	 * 장점: 연산이 빠르다
	 * 단점: 중간에 비면 안 됨 -- io등이 n에 종속되어 있다
	 * 물리적인 위치와 논리적인 위치가 같다
	 *
	 * ArrayList-Vector
	 * 
	 * 2. Linked List: 배열의 단점을 보완
	 * 논리적인 위치와 물리적인 위치는 다름(주소가 연달아서 나오지는 않음)
	 * insert/delete에 들어가는 비용이 배열보다 훨씬 적음
	 * 
	 * 배열의 요소의 개수가 굉장히 유동적이거나 io(입출력)가 많이 일어난다면 Linked List
	 * 엘리먼트(요소)가 고정적이라면 Array를 사용
	 */
	
	/*
	 * Stack-Queue(큐)
	 * 배열, 링크드 리스트 모두 스택, 큐를 구현할 수 있음
	 * 데이터의 추가/삭제는 앞/뒤에서만 일어난다
	 * 
	 * stack 마지막에 들어간 게 가장 먼저 나옴/LIFO, 후입선출
	 * 집어넣는 것 push, 꺼내는 것 pop
	 * 
	 * queue 먼저 들어간 게 가장 먼저 나옴/FIFO, 선입선출/선착순
	 * 
	 * ArrayList.remove(size()-1) --> 맨 끝에서 꺼낼 때
	 * ArrayList.remove(0) --> 맨 처음에서 꺼낼 때
	 */
	
	/*
	 * tree: 정렬하는 데 사용
	 * 
	 * BST(Binary Search Tree): 자식 노드가 최대 2개인 tree, 중복이 허용되지 않음(키 값이 동일할 수 없음)
	 * 부모 노드 왼쪽의 자식 노드 값은 부모 노드의 값보다 작아야 하고,
	 * 부모 노드 오른쪽의 자식 노드 값은 부모 노드의 값보다 커야 함.
	 * 균형 있는 tree여야 검색 속도가 빠름
	 * bst in-order travesal 하게 되면 오름차순으로 정렬
	 * 
	 * 
	 * 
	 */
	
	
	
	

}
