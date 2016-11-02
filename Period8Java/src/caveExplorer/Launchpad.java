package caveExplorer;

import java.util.Arrays;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.MidiDevice.Info;

public class Launchpad {
	
	public static final int WHITE = 3;
	public static final int RED = 5;
	public static final int GREEN = 21;
	public static final int BLUE = 49;
	public static final int YELLOW = 13;
	
	static MidiDevice launchpad;
	static Receiver nrec;
	
	public static final int[][] keys = {
			{64,65,66,67,96,97,98,99},
			{60,61,62,63,92,93,94,95},
			{56,57,58,59,88,89,90,91},
			{52,53,54,55,84,85,86,87},
			{48,49,50,51,80,81,82,83},
			{44,45,46,47,76,77,78,79},
			{40,41,42,43,72,73,74,75},
			{36,37,38,39,68,69,70,71}
			};
	
	static MidiDevice.Info[] infosA = MidiSystem.getMidiDeviceInfo();
	static String displaysAs = "LivePort";
	
	public static void main(String[] args) throws MidiUnavailableException, InterruptedException, InvalidMidiDataException {
		int launchpadDeviceNumber = 0;
		
		for (int i = 0; i < infosA.length; i++) {
			Info inf = infosA[i];
			String name = inf.getName().replace(" ", "");
			System.out.println("\"" + name + "\"");
			if (name.equals(displaysAs)) {
				launchpadDeviceNumber = i;
			}
			
		}
		
		System.out.println(launchpadDeviceNumber);
		
		launchpad = MidiSystem.getMidiDevice(infosA[launchpadDeviceNumber]);
		launchpad.open();

		int[][] pixelsssss = {{1,3},{2,4}};
		display(pixelsssss, 3, "flash");
		nrec = launchpad.getReceiver();
		
	}
	
	
	
	private static int[] seqIntArray(int startNum, int length){
		
		int[] outArr = new int[length];
		
		for (int i = 0; i < length; i++) {
			outArr[i] = startNum + i;
		}
		
		return outArr;
	}
	
	public static void display(int[][] pxl, int color, String mode) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
		for (int i = 0; i < pxl.length; i++) {
			
			int channel = 5;
			
			if (mode == "blink" || mode == "flash") {
				channel = 1;
			}
			else if (mode == "pulse" || mode == "fade") {
				channel = 2;
			} 
			
			int disp = keys[pxl[i][0]][pxl[i][1]];
			
			System.out.println(disp);
			
			ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, 2, disp, color);
			ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_OFF, 2, disp, color);
			
			launchpad.getReceiver().send(msg1, -1);
//			Thread.sleep(1000);
//			launchpad.getReceiver().send(msg2, -1);
		}
	}

}
