package caveExplorer;

import java.util.Arrays;

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

public class Launchpad {
	
	public static final int WHITE = 3;
	public static final int RED = 5;
	public static final int GREEN = 21;
	public static final int BLUE = 49;
	public static final int YELLOW = 13;
	
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
		
		System.out.println(launchpadInNumber);
		System.out.println(launchpadDeviceNumber);
		
		launchpad = MidiSystem.getMidiDevice(infosA[launchpadDeviceNumber]);
		launchpadIn = MidiSystem.getMidiDevice(infosA[launchpadInNumber]);
		launchpad.open();
		launchpadIn.open();
		
		nrec = launchpad.getReceiver();
		ntra = launchpadIn.getTransmitter();
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				int[] coordsArr = {i, j};
				display(coordsArr, 0, "solid");
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
		display(pixelsssss, 3, "solid");
		
			
		
		Thread.sleep(2000);
		
		clearPads(2, 0);
		
		System.exit(0);
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
			
//			System.out.println(disp);
			
			ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, channel, disp, color);
			ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_OFF, channel, disp, color);
			
			launchpad.getReceiver().send(msg1, -1);
//			Thread.sleep(1000);
//			launchpad.getReceiver().send(msg2, -1);
		}
	}
	
	public static void display(int[] pxl, int color, String mode) throws InterruptedException, InvalidMidiDataException, MidiUnavailableException {
		for (int i = 0; i < pxl.length; i++) {
			
			int channel = 5;
			
			if (mode == "blink" || mode == "flash") {
				channel = 1;
			}
			else if (mode == "pulse" || mode == "fade") {
				channel = 2;
			} 
			
			int disp = keys[pxl[0]][pxl[1]];
			
//			System.out.println(disp);
			
			ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, channel, disp, color);
			ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_OFF, channel, disp, color);
			
			launchpad.getReceiver().send(msg1, -1);
//			Thread.sleep(1000);
//			launchpad.getReceiver().send(msg2, -1);
		}
	}
	
	public static void clearPads(int indDelay, int rowDelay) throws InvalidMidiDataException, MidiUnavailableException, InterruptedException {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
//					ShortMessage msg1 = new ShortMessage(ShortMessage.NOTE_ON, 1, keys[i][j], 0);
//					ShortMessage msg2 = new ShortMessage(ShortMessage.NOTE_ON, 2, keys[i][j], 0);
//					ShortMessage msg5 = new ShortMessage(ShortMessage.NOTE_ON, 5, keys[i][j], 0);
//					launchpad.getReceiver().send(msg1, -1);
//					launchpad.getReceiver().send(msg2, -1);
//					launchpad.getReceiver().send(msg5, -1);
				
				int[] pxl = {i, j};

				changePixel(launchpad, pxl, 1, 0);
				changePixel(launchpad, pxl, 2, 0);
				changePixel(launchpad, pxl, 5, 0);

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
}


