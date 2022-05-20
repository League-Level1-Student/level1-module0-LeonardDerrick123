package _11_spinning_record;

public class spinningRecord {
	
	public spinningRecord() {
		// TODO Auto-generated constructor stub
		PImage pictureOfRecord;                        //as member variable
	    size(600,600);                                 //in setup method
	    pictureOfRecord= loadImage("record.png");      //in setup method
	    image(pictureOfRecord, xPosition, yPosition);  //in draw method
	}

}
