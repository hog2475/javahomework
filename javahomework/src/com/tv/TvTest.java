package com.tv;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tvArray[] = new Tv[3];
		String nameDesarr[] = {"INFINIA","LED TV",
				"XCANVAS","LCD TV",
				"CINEMA","3D TV"};
		int prarr[] = {1500000,1000000,2000000};
		for(int i =0; i < tvArray.length;i++){
			tvArray[i] = new Tv(nameDesarr[i*2],prarr[i],nameDesarr[i*2+1]);
		}
		for(int i = 0; i < tvArray.length;i++)
			System.out.println(tvArray[i].toString());
		String minPriceName ="";
		String maxPriceName = "";
		int min = 0;
		int max = 0;
		for(int i =0; i < tvArray.length; i++){
			if(i == 0){
				min = tvArray[i].price;
				max = tvArray[i].price;
				minPriceName = tvArray[i].name;
				maxPriceName = tvArray[i].name;
			}
			else{
				if(min > tvArray[i].price){
					min = tvArray[i].price;
					minPriceName = tvArray[i].name;
				}
				if(max < tvArray[i].price){
					max = tvArray[i].price;
					maxPriceName = tvArray[i].name;
				}
			}
		}
		System.out.println("가격이 가장 비싼 제품: "+maxPriceName);
		System.out.println("가격이 가장 저렴한 제품: "+minPriceName);
	}

}
