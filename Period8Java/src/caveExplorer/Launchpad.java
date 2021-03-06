package caveExplorer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.sound.midi.Transmitter;
import javax.sound.midi.MidiDevice.Info;

import java.util.Arrays;
import java.util.ArrayList;

public class Launchpad {
	
	public static final int WHITE = 3;
	public static final int RED = 5;
	public static final int GREEN = 21;
	public static final int BLUE = 49;
	public static final int YELLOW = 13;
	
//	CHANNEL NUMBERING IN JAVA STARTS AT 0, IN MIDI STARTS AT 1
	public static final int FLASH = 1;
	public static final int PULSE = 2;
	public static final int SOLID = 5;
	
	public static final int NOTE_ON = 0x90;
	
	static MidiDevice launchpad;
	static MidiDevice launchpadIn;
	static Receiver nrec;
	static Transmitter ntra;
	
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
		int launchpadDeviceNumber = -1;
		int	launchpadInNumber = -1;
		
		for (int i = 0; i < infosA.length; i++) {
			Info inf = infosA[i];
			String name = inf.getName().replace(" ", "");
			System.out.println("\"" + name + "\"");
			if (name.equals(displaysAs)) {
				launchpadDeviceNumber = i;
			}
			
		}
		for (int i = 0; i < infosA.length; i++) {
			Info inf = infosA[i];
			String name = inf.getName().replace(" ", "");
			System.out.println("\"" + name + "\"");
			if (name.equals(displaysAs)) {
				launchpadInNumber = i;
				break;
			}
			
		}
		
		System.out.println("Receiving from MIDI device " + launchpadInNumber);
		System.out.println("Sending to MIDI device     " + launchpadDeviceNumber);
		
		launchpad = MidiSystem.getMidiDevice(infosA[launchpadDeviceNumber]);
		launchpadIn = MidiSystem.getMidiDevice(infosA[launchpadInNumber]);
		launchpad.open();
		launchpadIn.open();
		
		nrec = launchpad.getReceiver();
		ntra = launchpadIn.getTransmitter();
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int[] coordsArr = {i, j};
				display(launchpad, coordsArr, 79, "solid");
				Thread.sleep(2);
			}
		}
		int[][] pixelsssss = {
				{0,1},
				{1,1},
				{1,3},
				{2,1},
				{2,2},
				{2,3},
				{2,4},
				};
//		display(launchpad, pixelsssss, 3, "solid");
		
		long[] times = {250, 250, 250, 250, 250, 250};
		
		flashImg(launchpad, pixelsssss, GREEN, times, 0, 20, true);
		
			
		
		Thread.sleep(2000);
		
		clearPads(launchpad, 0, 20);
		
		System.exit(0);
	}
	
	
	
	



	private static int[] seqIntArray(int startNum, int length){
		
		int[] outArr = new int[length];
		
		for (int i = 0; i < length; i++) {
			outArr[i] = startNum + i;
		}
		
		return outArr;
	}
	
	public static void display(MidiDevice device, int[][] pxl, int color, String mode) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
		
		for (int i = 0; i < pxl.length; i++) {
			
			int channel;
			switch (mode) {
			case "blink": channel = FLASH;
			case "flash": channel = FLASH;
			case "pulse": channel = PULSE;
			default: channel = SOLID;
			}
			
			
//			int disp = keys[pxl[i][0]][pxl[i][1]];
			
//			System.out.println(disp);
			
//			ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, channel, disp, color);
//			ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_OFF, channel, disp, color);
//			
//			launchpad.getReceiver().send(msg1, -1);
//			Thread.sleep(1000);
//			launchpad.getReceiver().send(msg2, -1);
			
			changePixel(device, pxl[i], channel, color);
			
		}
	}
	
	public static void display(MidiDevice device, int[] pxl, int color, String mode) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
		
		
		for (int i = 0; i < pxl.length; i++) {
			
			int channel;
			switch (mode) {
			case "blink": channel = FLASH;
			case "flash": channel = FLASH;
			case "pulse": channel = PULSE;
			default: channel = SOLID;
			}
			
			changePixel(device, pxl, channel, color);
			
//			int disp = keys[pxl[0]][pxl[1]];
//			
////			System.out.println(disp);
//			
//			ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, channel, disp, color);
//			ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_OFF, channel, disp, color);
//			
//			device.getReceiver().send(msg1, -1);
////			Thread.sleep(1000);
//			launchpad.getReceiver().send(msg2, -1);
		}
	}
	
	public static void clearPads(MidiDevice device, int indDelay, int rowDelay) throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
//					ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, 1, keys[i][j], 0);
//					ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_ON, 2, keys[i][j], 0);
//					ShortMessage msg5 = new ShortMessage(ShortMessage.NOTE_ON, 5, keys[i][j], 0);
//					device.getReceiver().send(msg1, -1);
//					device.getReceiver().send(msg2, -1);
//					device.getReceiver().send(msg5, -1);
				
				int[] pxl = {i, j};

				changePixel(device, pxl, FLASH, 0);
				changePixel(device, pxl, PULSE, 0);
				changePixel(device, pxl, SOLID, 0);

				Thread.sleep(indDelay);
			}
			Thread.sleep(rowDelay);
		}
	}
	
	public static void changePixel(MidiDevice device, int[] pxl, int channel, int color) throws InvalidMidiDataException, MidiUnavailableException {
		ShortMessage msg = new ShortMessage(ShortMessage.NOTE_ON, channel, keys[pxl[0]][pxl[1]], color);
		device.getReceiver().send(msg, -1);
	}
	
	public static int getInput() throws MidiUnavailableException, InvalidMidiDataException{
		Sequencer sequencer = MidiSystem.getSequencer();
		
		Transmitter transmitter;
		Receiver receiver;

		// Open a connection to the default sequencer (as specified by MidiSystem)
		sequencer.open();
		// Get the transmitter class from your input device
		transmitter = launchpadIn.getTransmitter();
		// Get the receiver class from your sequencer
		receiver = sequencer.getReceiver();
		// Bind the transmitter to the receiver so the receiver gets input from the transmitter
		transmitter.setReceiver(receiver);
		
		while(true){

			Sequence seq = new Sequence(Sequence.PPQ, 1);
			Track currentTrack = seq.createTrack();
			sequencer.setSequence(seq);
			sequencer.setTickPosition(1);
			sequencer.recordEnable(currentTrack, -1);
			sequencer.startRecording();
			
			int cursize = currentTrack.size();
			while(sequencer.isRecording()){ 
				if(currentTrack.size() != cursize){
					cursize = currentTrack.size();
//					System.out.println(currentTrack.size());
				}
				if(cursize >= 2) {
					sequencer.stopRecording();
				}
			}
			
			sequencer.recordDisable(currentTrack);
			Sequence sequence = sequencer.getSequence();

			int trackNumber = 0;
			for (Track track :  sequence.getTracks()) {
				trackNumber++;
				for (int i=0; i < track.size(); i++) { 
					MidiEvent event = track.get(i);
					MidiMessage message = event.getMessage();
					if (message instanceof ShortMessage) {
						ShortMessage sm = (ShortMessage) message;
						if (sm.getCommand() == NOTE_ON) {
							int key = sm.getData1();
							int velocity = sm.getData2();
							if (velocity > 0) {
								System.out.println(key);
							}
						}
//	                    else if (sm.getCommand() == NOTE_OFF) {
//	                        int key = sm.getData1();
//	                        int velocity = sm.getData2();
//	                        System.out.println(key);
//	                    }
	                }
	            }
	        }
		}
	}
	
	public static void flashImg(MidiDevice device, int[][] pxls, int color, long[] times, int indDelay, int rowDelay, boolean pauseAtEnd) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException{
		int[][] sortedPixels = new int[pxls.length][2];
		
		int count = 0;
		for (int i = 0; i < keys.length; i++) {
			for (int j = 0; j < keys[i].length; j++) {
				int[] toSearchFor = {i,j};
//				System.out.println("searching for " + toSearchFor[0] + " " + toSearchFor[1]);
				int index = arrIndexOf(toSearchFor, pxls);
//				System.out.println(index >= 0);
				if(index >= 0) {
					sortedPixels[count] = pxls[index];
					count++;
				}
			}
		}
		
		for (int i = 0; i < times.length; i++) {
			displayDelay(device, sortedPixels, color, "solid", indDelay, rowDelay);
			Thread.sleep(times[i]);
			i++;
			clearPads(device, indDelay, rowDelay);
			if (i < times.length - 1 || pauseAtEnd) {
				Thread.sleep(times[i]);
			}
		}
		if(pauseAtEnd) {
			displayDelay(device, sortedPixels, color, "solid", indDelay, rowDelay);
		}
	}







	private static void displayDelay(MidiDevice device, int[][] pxls, int color, String mode, int indDelay, int rowDelay) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
		int[][] sortedPixels = new int[pxls.length][2];
		
		int count = 0;
		for (int i = 0; i < keys.length; i++) {
			for (int j = 0; j < keys[i].length; j++) {
				int[] toSearchFor = {i,j};
//				System.out.println("searching for " + toSearchFor[0] + " " + toSearchFor[1]);
				int index = arrIndexOf(toSearchFor, pxls);
//				System.out.println(index >= 0);
				if(index >= 0) {
					sortedPixels[count] = pxls[index];
					count++;
				}
			}
		}
		
		for (int j = 0; j < keys.length; j++) {
			for (int i = 0; i < sortedPixels.length; i++) {
				if(sortedPixels[i][0] == j) {
					display(device, sortedPixels[i], color, mode);
					Thread.sleep(indDelay);
				}
			}
			Thread.sleep(rowDelay);
		}
	}

	private static int[] indexesIn2DArr(int n, int[][] arr2D) {
		int[] indexes = {-1, -1};
		
		for (int i = 0; i < arr2D.length; i++) {
			for (int j = 0; j < arr2D[i].length; j++) {
				int q;
				q = arr2D[i][j];
				if (q == n) {
					indexes[0] = i;
					indexes[1] = j;
					return indexes;
				}
			}
		}
		
		return indexes;
	}





	private static int arrIndexOf(int[] nArr, int[][] arr2D) {
		for (int i = 0; i < arr2D.length; i++) {
				int count = 0;
				for (int n = 0; n < arr2D[i].length; n++) {
					if (arr2D[i][n] == nArr[n]) {
						count++;
					}
				}
				if (count == nArr.length) {
					return i;
				}
				
				
//				if(arr2D[i].equals(n)){
//					return i;
//				}
			
		}
		return -1;
	}
}







	



