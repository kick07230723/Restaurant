package org.zerock.domain;

public class Criteria {
	private int page;
	private int size;
	
	public Criteria(){
		this.page=1;
		this.size=10;
		
	}
	
	//빌더패턴사용할거!
	public Criteria settingPage(int page){
		if(page<=0){
			this.page=1;	
		}
		return this;
	}
	
	//원래는 생성자 4개만들어야?? 하는데 내가 골라서 정보 세팅 가능해서 좋다
	public Criteria settingSize(int size){
		if(size<=0 ||size<=5){
			this.size=5;	
		}
		return this;
	}
	
	public int getSkip(){
		return (this.page -1)*(this.size);		
	}
	
	public int getAmount(){
		return this.size;
	}

	public int getPage() {
		return page;
	}

	public int getSize() {
		return size;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", size=" + size + "]";
	}


	
}
