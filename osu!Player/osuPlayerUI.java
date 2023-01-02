import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.plaf.metal.MetalSliderUI;
import java.util.List;
import java.util.ArrayList;

public class osuPlayerUI {

	public static int loopI = 0;

	public static void addDiffToCollectionUI() {
		osuPlayer.addDiffToCollection();
	}
	public static void deleteDiffToCollectionUI() {
		osuPlayer.deleteDiffToCollection();
	}
	public static void playSongUI() {
		osuPlayer.playSong();
	}
	public static void playCollectionUI() {
		osuPlayer.playCollection();
	}
	public static void deleteCollectionUI() {
		osuPlayer.deleteCollection();
	}
	public static void pauseOrPlayUI() {
		osuPlayer.pauseOrPlay();
	}
	public static void nextSongUI() {
		osuPlayer.nextSong();
	}
	public static void lastSongUI() {
		osuPlayer.lastSong();
	}
	public static void changeLoopTypeUI() {
		osuPlayer.changeLoopType();
	}
	public static void saveDatabaseUI() {
		osuPlayer.saveDatabase();
	}
	public static void readDatabaseUI(String path) {
		osuPlayer.readDatabase(path);
	}
 	public static void mainUI(String[] args) {
 		main(args);
 	}

 	public static String openDatabaseUI() {
 		JFileChooser fc = new JFileChooser();
 		fc.showOpenDialog(null);

 		String path = fc.getSelectedFile().getAbsolutePath();

 		if (path.length() >= 13) {
 			if (path.substring(path.length() - 13, path.length()).equals("collection.db")) {
				return path;
 			}
 			else {
 				System.out.println("Please uploaded your collection.db file from osu!");
 			}
 		}
 		else {
 			System.out.println("Please uploaded your collection.db file from osu!");
 		}

 		return null;
 	}

	public static void openDiffs(JFrame mainFrame, JPanel mainPanel) {

		final int BORDER_X = 600;
		final int BORDER_Y = 400;
		final int SCROLL_X = 500;
		final int SCROLL_Y = 300;

 		List<String[]> diffList = new ArrayList<>();

 		//temp songs until database is implemented
 		diffList.add(new String[] {"Diff 1"});
 		diffList.add(new String[] {"Diff 2"});
 		diffList.add(new String[] {"Diff 3"});
 		diffList.add(new String[] {"Diff 4"});
 		diffList.add(new String[] {"Diff 5"});
 		diffList.add(new String[] {"Diff 6"});
 		diffList.add(new String[] {"Diff 7"});
 		diffList.add(new String[] {"Diff 8"});
 		diffList.add(new String[] {"Diff 9"});
 		diffList.add(new String[] {"Diff 10"});
 		diffList.add(new String[] {"Diff 11"});
 		diffList.add(new String[] {"Diff 12"});
 		diffList.add(new String[] {"Diff 13"});
 		

 		//start of used code

 		JDialog dialog = new JDialog(mainFrame, "Difficulties");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(BORDER_X, BORDER_Y);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel pageLB = new JLabel("Difficulties:");
		JLabel noSongsLB = new JLabel("Please upload to osu!Player");
		JButton backBtn = new JButton("Back");

		JPanel verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		verticalPanel.setAutoscrolls(true);
		dialog.add(verticalPanel, BorderLayout.NORTH);

		JScrollPane scrollPanel = new JScrollPane(verticalPanel);
		scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setBounds(50, 30, SCROLL_X, SCROLL_Y); //scroll dimensions

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(BORDER_X, BORDER_Y));
        contentPanel.add(scrollPanel);

        for (int i = 0; i < diffList.size(); i++) {

        	switch (i) {
	        	case 0:
	        		noSongsLB.setVisible(false);
	        		break;
        	}

        	JPanel basePanel = new JPanel();
        	basePanel.setLayout(new FlowLayout());
        	//basePanel.setBackground(Color.BLUE);
        	basePanel.setPreferredSize(new Dimension(SCROLL_X, 70));
            
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(null);
            itemPanel.setBackground(Color.LIGHT_GRAY);
            itemPanel.setPreferredSize(new Dimension(SCROLL_X, 70));

            JLabel collectionNameLB = new JLabel(diffList.get(i)[0]);
            collectionNameLB.setBounds(10, 0, 400, 25);
  
            JButton addBtn = new JButton();
            addBtn.setBounds(SCROLL_X - 50, 5, 25, 25);
            JLabel addLB = new JLabel("Add:");
            addLB.setBounds(SCROLL_X - 85, 5, 400, 25); 
			addBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					//add diff to collection
					addDiffToCollectionUI();
				} 
			});

            JButton deleteBtn = new JButton();
            deleteBtn.setBounds(SCROLL_X - 50, 35, 25, 25);
            JLabel deleteLB = new JLabel("Delete:");
            deleteLB.setBounds(SCROLL_X - 105, 35, 400, 25);
			deleteBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					//remove diff from collection
					deleteDiffToCollectionUI();
				} 
			});

            //add component to item panel
            itemPanel.add(collectionNameLB, 0, 0);
            itemPanel.add(addBtn);
            itemPanel.add(deleteBtn);
            itemPanel.add(addLB);
            itemPanel.add(deleteLB);

            basePanel.add(itemPanel);
            verticalPanel.add(basePanel);
        }

        dialog.add(pageLB, BorderLayout.NORTH);
        dialog.add(contentPanel, BorderLayout.CENTER);
        dialog.add(noSongsLB, BorderLayout.SOUTH);
        dialog.setVisible(true);
 	}

	public static void openMappers(JFrame mainFrame, JPanel mainPanel) {

		final int BORDER_X = 600;
		final int BORDER_Y = 400;
		final int SCROLL_X = 500;
		final int SCROLL_Y = 300;

 		List<String[]> mapperList = new ArrayList<>();

 		//temp songs until database is implemented
 		mapperList.add(new String[] {"Mapper 1"});
 		mapperList.add(new String[] {"Mapper 2"});
 		mapperList.add(new String[] {"Mapper 3"});
 		mapperList.add(new String[] {"Mapper 4"});
 		mapperList.add(new String[] {"Mapper 5"});
 		mapperList.add(new String[] {"Mapper 6"});
 		mapperList.add(new String[] {"Mapper 7"});
 		mapperList.add(new String[] {"Mapper 8"});
 		mapperList.add(new String[] {"Mapper 9"});
 		mapperList.add(new String[] {"Mapper 10"});
 		mapperList.add(new String[] {"Mapper 11"});
 		mapperList.add(new String[] {"Mapper 12"});
 		mapperList.add(new String[] {"Mapper 13"});
 		

 		//start of used code

 		JDialog dialog = new JDialog(mainFrame, "Mappers");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(BORDER_X, BORDER_Y);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel pageLB = new JLabel("Mappers:");
		JLabel noSongsLB = new JLabel("Please upload to osu!Player");
		JButton backBtn = new JButton("Back");

		JPanel verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		verticalPanel.setAutoscrolls(true);
		dialog.add(verticalPanel, BorderLayout.NORTH);

		JScrollPane scrollPanel = new JScrollPane(verticalPanel);
		scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setBounds(50, 30, SCROLL_X, SCROLL_Y); //scroll dimensions

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(BORDER_X, BORDER_Y));
        contentPanel.add(scrollPanel);

        for (int i = 0; i < mapperList.size(); i++) {

        	switch (i) {
	        	case 0:
	        		noSongsLB.setVisible(false);
	        		break;
        	}

        	JPanel basePanel = new JPanel();
        	basePanel.setLayout(new FlowLayout());
        	//basePanel.setBackground(Color.BLUE);
        	basePanel.setPreferredSize(new Dimension(SCROLL_X, 50));
            
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(null);
            itemPanel.setBackground(Color.LIGHT_GRAY);
            itemPanel.setPreferredSize(new Dimension(SCROLL_X, 50));

            JLabel collectionNameLB = new JLabel(mapperList.get(i)[0]);
            collectionNameLB.setBounds(10, 0, 400, 25);
  
            JButton diffsBtn = new JButton();
            diffsBtn.setBounds(SCROLL_X - 50, 10, 25, 25);
            JLabel diffsLB = new JLabel("Diffs:");
            diffsLB.setBounds(SCROLL_X - 81, 10, 400, 25);
			diffsBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openDiffs(mainFrame, mainPanel);
				} 
			});  

            //add component to item panel
            itemPanel.add(collectionNameLB, 0, 0);
            itemPanel.add(diffsBtn);
            itemPanel.add(diffsLB);

            basePanel.add(itemPanel);
            verticalPanel.add(basePanel);
        }

        dialog.add(pageLB, BorderLayout.NORTH);
        dialog.add(contentPanel, BorderLayout.CENTER);
        dialog.add(noSongsLB, BorderLayout.SOUTH);
        dialog.setVisible(true);
 	}

	public static void openArtist(JFrame mainFrame, JPanel mainPanel) {

		final int BORDER_X = 600;
		final int BORDER_Y = 400;
		final int SCROLL_X = 500;
		final int SCROLL_Y = 300;

 		List<String[]> artistSongList = new ArrayList<>();

 		//temp songs until database is implemented
 		artistSongList.add(new String[] {"Song 1"});
 		artistSongList.add(new String[] {"Song 2"});
 		artistSongList.add(new String[] {"Song 3"});
 		artistSongList.add(new String[] {"Song 4"});
 		artistSongList.add(new String[] {"Song 5"});
 		artistSongList.add(new String[] {"Song 6"});
 		artistSongList.add(new String[] {"Song 7"});
 		artistSongList.add(new String[] {"Song 8"});
 		artistSongList.add(new String[] {"Song 9"});
 		artistSongList.add(new String[] {"Song 10"});
 		artistSongList.add(new String[] {"Song 11"});
 		artistSongList.add(new String[] {"Song 12"});
 		artistSongList.add(new String[] {"Song 13"});


 		//start of used code

 		JDialog dialog = new JDialog(mainFrame, "Artist");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(BORDER_X, BORDER_Y);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel pageLB = new JLabel("Artist:");
		JLabel noSongsLB = new JLabel("Please upload to osu!Player");
		JButton backBtn = new JButton("Back");

		JPanel verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		verticalPanel.setAutoscrolls(true);
		dialog.add(verticalPanel, BorderLayout.NORTH);

		JScrollPane scrollPanel = new JScrollPane(verticalPanel);
		scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setBounds(50, 30, SCROLL_X, SCROLL_Y); //scroll dimensions

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(BORDER_X, BORDER_Y));
        contentPanel.add(scrollPanel);

        for (int i = 0; i < artistSongList.size(); i++) {

        	switch (i) {
	        	case 0:
	        		noSongsLB.setVisible(false);
	        		break;
        	}

        	JPanel basePanel = new JPanel();
        	basePanel.setLayout(new FlowLayout());
        	//basePanel.setBackground(Color.BLUE);
        	basePanel.setPreferredSize(new Dimension(SCROLL_X, 70));
            
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(null);
            itemPanel.setBackground(Color.LIGHT_GRAY);
            itemPanel.setPreferredSize(new Dimension(SCROLL_X, 70));

            JLabel collectionNameLB = new JLabel(artistSongList.get(i)[0]);
            collectionNameLB.setBounds(10, 0, 400, 25);

            JButton playBtn = new JButton();
            playBtn.setBounds(SCROLL_X - 145, 10, 35, 35);
            JLabel playLB = new JLabel("Play:");
            playLB.setBounds(SCROLL_X - 175, 10, 400, 35); 
			playBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					playSongUI();
				} 
			});           

            JButton diffsBtn = new JButton();
            diffsBtn.setBounds(SCROLL_X - 50, 5, 25, 25);
            JLabel diffsLB = new JLabel("Diffs:");
            diffsLB.setBounds(SCROLL_X - 85, 5, 400, 25); 
			diffsBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openDiffs(mainFrame, mainPanel);
				} 
			});

            JButton mappersBtn = new JButton();
            mappersBtn.setBounds(SCROLL_X - 50, 35, 25, 25);
            JLabel mappersLB = new JLabel("Mappers:");
            mappersLB.setBounds(SCROLL_X - 105, 35, 400, 25);
			mappersBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openMappers(mainFrame, mainPanel);
				} 
			});   

            //add component to item panel
            itemPanel.add(collectionNameLB, 0, 0);
            itemPanel.add(playBtn);
            itemPanel.add(mappersBtn);
            itemPanel.add(diffsBtn);
            itemPanel.add(mappersLB);
            itemPanel.add(diffsLB);
            itemPanel.add(playLB);

            basePanel.add(itemPanel);
            verticalPanel.add(basePanel);
        }

        dialog.add(pageLB, BorderLayout.NORTH);
        dialog.add(contentPanel, BorderLayout.CENTER);
        dialog.add(noSongsLB, BorderLayout.SOUTH);
        dialog.setVisible(true);
 	}

 	public static void openCollections(JFrame mainFrame, JPanel mainPanel) {

		final int BORDER_X = 600;
		final int BORDER_Y = 400;
		final int SCROLL_X = 500;
		final int SCROLL_Y = 300;

 		List<String[]> collectionList = new ArrayList<>();

 		//temp songs until database is implemented
 		collectionList.add(new String[] {"-- Stream Maps --"});
 		collectionList.add(new String[] {"-- Tech Maps --"});
 		collectionList.add(new String[] {"-- Tourney Maps --"});
 		collectionList.add(new String[] {"MAP: NM1"});
 		collectionList.add(new String[] {"MAP: NM2"});
 		collectionList.add(new String[] {"MAP: NM3"});
 		collectionList.add(new String[] {"MAP: NM4"});
 		collectionList.add(new String[] {"MAP: NM5"});
 		collectionList.add(new String[] {"MAP: NM6"});
 		collectionList.add(new String[] {"MAP: HD1"});
 		collectionList.add(new String[] {"MAP: HD2"});
 		collectionList.add(new String[] {"MAP: HD3"});
 		collectionList.add(new String[] {"MAP: HR1"});
 		collectionList.add(new String[] {"MAP: HR2"});
 		collectionList.add(new String[] {"MAP: HR3"});
 		collectionList.add(new String[] {"MAP: DT1"});
 		collectionList.add(new String[] {"MAP: DT2"});
 		collectionList.add(new String[] {"MAP: DT3"});
 		collectionList.add(new String[] {"MAP: DT4"});
 		collectionList.add(new String[] {"MAP: FM1"});
 		collectionList.add(new String[] {"MAP: FM2"});
 		collectionList.add(new String[] {"MAP: FM3"});
 		collectionList.add(new String[] {"MAP: TB"});


 		//start of used code

 		JDialog dialog = new JDialog(mainFrame, "Collections");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(BORDER_X, BORDER_Y);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel pageLB = new JLabel("Collection List:");
		JLabel noSongsLB = new JLabel("Please upload to osu!Player");
		JButton backBtn = new JButton("Back");

		JPanel verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		verticalPanel.setAutoscrolls(true);
		dialog.add(verticalPanel, BorderLayout.NORTH);

		JScrollPane scrollPanel = new JScrollPane(verticalPanel);
		scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setBounds(50, 30, SCROLL_X, SCROLL_Y); //scroll dimensions

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(BORDER_X, BORDER_Y));
        contentPanel.add(scrollPanel);

        for (int i = 0; i < collectionList.size(); i++) {

        	switch (i) {
	        	case 0:
	        		noSongsLB.setVisible(false);
	        		break;
        	}

        	JPanel basePanel = new JPanel();
        	basePanel.setLayout(new FlowLayout());
        	//basePanel.setBackground(Color.BLUE);
        	basePanel.setPreferredSize(new Dimension(SCROLL_X, 55));
            
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(null);
            itemPanel.setBackground(Color.LIGHT_GRAY);
            itemPanel.setPreferredSize(new Dimension(SCROLL_X, 55));

            JLabel collectionNameLB = new JLabel(collectionList.get(i)[0]);
            collectionNameLB.setBounds(10, 0, 400, 25);

            JButton playBtn = new JButton();
            playBtn.setBounds(SCROLL_X - 135, 10, 35, 35);
            JLabel playLB = new JLabel("Play:");
            playLB.setBounds(SCROLL_X - 165, 10, 400, 35); 
			playBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					playCollectionUI();
				} 
			});           

            JButton deleteBtn = new JButton();
            deleteBtn.setBounds(SCROLL_X - 50, 14, 25, 25);
            JLabel deleteLB = new JLabel("Delete:");
            deleteLB.setBounds(SCROLL_X - 95, 14, 400, 25);
			deleteBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					deleteCollectionUI();
				} 
			});       

            //add component to item panel
            itemPanel.add(collectionNameLB, 0, 0);
            itemPanel.add(playBtn);
            itemPanel.add(deleteBtn);
            itemPanel.add(deleteLB);
            itemPanel.add(playLB);

            basePanel.add(itemPanel);
            verticalPanel.add(basePanel);
        }

        dialog.add(pageLB, BorderLayout.NORTH);
        dialog.add(contentPanel, BorderLayout.CENTER);
        dialog.add(noSongsLB, BorderLayout.SOUTH);
        dialog.setVisible(true);
 	}

 	public static void changeLoopImage(JButton songLoopTypeBtn) {
 		loopI++;
 		switch (loopI % 3) {
 			case 0:
 				songLoopTypeBtn.setText("∞");
 				//loop all image
 				break;
 			case 1:
 				songLoopTypeBtn.setText("∞1");
 				//loop 1 image
 				break;
 			case 2:
 				songLoopTypeBtn.setText("ran");
 				//random song image
 				break;
 		}
 	}

 	public static void openInfo(int borderX, int borderY, JFrame mainFrame, JPanel mainPanel) {

 		//dialog setup
		JDialog dialog = new JDialog(mainFrame, "Song Info");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(borderX, borderY);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//panel
		JPanel colPanel = new JPanel();

		//components
		JLabel pageLB = new JLabel("Song Info");

		//locations and size
		pageLB.setBounds(100, 50, 100, 25);

		//add panel to dialog
		dialog.add(colPanel);

		//add components to dialog
		colPanel.add(pageLB);

		//set visible
		dialog.setVisible(true);
 	}

 	public static void openSongMenu(JFrame mainFrame, JPanel mainPanel) {

		final int BORDER_X = 600;
		final int BORDER_Y = 400;
		final int SCROLL_X = 500;
		final int SCROLL_Y = 300;

 		List<String[]> songList = new ArrayList<>();

 		//temp songs until database is implemented
 		songList.add(new String[] {"Yomi yori Kikoyu, Koukoku no Tou to Honoo no Shoujo.", "Imperial Circus Dead Decadence", "DoKido", "Kyouaku"});
 		songList.add(new String[] {"THE MEDLEY OF POKEMON RGBY+GSC -3PBs-", "hapi", "Kenterz", "Marathon"});
 		songList.add(new String[] {"Yume no Tsubomi", "Inori Minase", "Lami","Promise"});
 		songList.add(new String[] {"Yomi yori Kikoyu, Koukoku no Tou to Honoo no Shoujo.", "Imperial Circus Dead Decadence", "DoKido", "Kyouaku"});
 		songList.add(new String[] {"THE MEDLEY OF POKEMON RGBY+GSC -3PBs-", "hapi", "Kenterz", "Marathon"});
 		songList.add(new String[] {"Yume no Tsubomi", "Inori Minase", "Lami","Promise"});
 		songList.add(new String[] {"Yomi yori Kikoyu, Koukoku no Tou to Honoo no Shoujo.", "Imperial Circus Dead Decadence", "DoKido", "Kyouaku"});
 		songList.add(new String[] {"THE MEDLEY OF POKEMON RGBY+GSC -3PBs-", "hapi", "Kenterz", "Marathon"});
 		songList.add(new String[] {"Yume no Tsubomi", "Inori Minase", "Lami","Promise"});
 		songList.add(new String[] {"Yomi yori Kikoyu, Koukoku no Tou to Honoo no Shoujo.", "Imperial Circus Dead Decadence", "DoKido", "Kyouaku"});
 		songList.add(new String[] {"THE MEDLEY OF POKEMON RGBY+GSC -3PBs-", "hapi", "Kenterz", "Marathon"});
 		songList.add(new String[] {"Yume no Tsubomi", "Inori Minase", "Lami","Promise"});
 		songList.add(new String[] {"Yomi yori Kikoyu, Koukoku no Tou to Honoo no Shoujo.", "Imperial Circus Dead Decadence", "DoKido", "Kyouaku"});
 		songList.add(new String[] {"THE MEDLEY OF POKEMON RGBY+GSC -3PBs-", "hapi", "Kenterz", "Marathon"});
 		songList.add(new String[] {"Yume no Tsubomi", "Inori Minase", "Lami","Promise"});

 		//start of used code

 		JDialog dialog = new JDialog(mainFrame, "Songs");
		dialog.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		dialog.setSize(BORDER_X, BORDER_Y);
		dialog.setLocationRelativeTo(null);
		dialog.setResizable(false);
		dialog.setModal(true);
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel pageLB = new JLabel("Song List:");
		JLabel noSongsLB = new JLabel("Please upload songs to osu!Player");
		JButton backBtn = new JButton("Back");

		JPanel verticalPanel = new JPanel();
		verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
		verticalPanel.setAutoscrolls(true);
		dialog.add(verticalPanel, BorderLayout.NORTH);

		JScrollPane scrollPanel = new JScrollPane(verticalPanel);
		scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.setBounds(50, 30, SCROLL_X, SCROLL_Y); //scroll dimensions

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(BORDER_X, BORDER_Y));
        contentPanel.add(scrollPanel);

        for (int i = 0; i < songList.size(); i++) {

        	switch (i) {
        	case 0:
        		noSongsLB.setVisible(false);
        		break;
        	}

        	JPanel basePanel = new JPanel();
        	basePanel.setLayout(new FlowLayout());
        	//basePanel.setBackground(Color.BLUE);
        	basePanel.setPreferredSize(new Dimension(SCROLL_X, 100));
            
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(null);
            itemPanel.setBackground(Color.LIGHT_GRAY);
            itemPanel.setPreferredSize(new Dimension(SCROLL_X, 100));

            JLabel songNameLB = new JLabel(songList.get(i)[0]);
            songNameLB.setBounds(10, 0, 400, 25);
            JLabel artistNameLB = new JLabel(songList.get(i)[1]);
            artistNameLB.setBounds(35, 25, 400, 25);

            JButton playBtn = new JButton();
            playBtn.setBounds(SCROLL_X - 145, 32, 35, 35);
            JLabel playLB = new JLabel("Play:");
            playLB.setBounds(SCROLL_X - 175, 32, 400, 35); 
			playBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					playSongUI();
				} 
			});

            JButton artistBtn = new JButton();
            artistBtn.setBounds(SCROLL_X - 50, 5, 25, 25);
            JLabel artistLB = new JLabel("Artist:");
            artistLB.setBounds(SCROLL_X - 85, 5, 400, 25); 
			artistBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openArtist(mainFrame, mainPanel);
				} 
			});

            JButton mappersBtn = new JButton();
            mappersBtn.setBounds(SCROLL_X - 50, 35, 25, 25);
            JLabel mappersLB = new JLabel("Mappers:");
            mappersLB.setBounds(SCROLL_X - 105, 35, 400, 25);
			mappersBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openMappers(mainFrame, mainPanel);
				} 
			}); 

            JButton diffsBtn = new JButton();
            diffsBtn.setBounds(SCROLL_X - 50, 65, 25, 25);
            JLabel diffsLB = new JLabel("Diffs:");
            diffsLB.setBounds(SCROLL_X - 82, 65, 400, 25);
			diffsBtn.addActionListener(new ActionListener() { 
				public void actionPerformed(ActionEvent e) { 
					openDiffs(mainFrame, mainPanel);
				} 
			});           

            //add component to item panel
            itemPanel.add(songNameLB, 0, 0);
            itemPanel.add(artistNameLB, 1, 0);
            itemPanel.add(playBtn);
            itemPanel.add(artistBtn);
            itemPanel.add(mappersBtn);
            itemPanel.add(diffsBtn);
            itemPanel.add(artistLB);
            itemPanel.add(mappersLB);
            itemPanel.add(diffsLB);
            itemPanel.add(playLB);
            basePanel.add(itemPanel);
            verticalPanel.add(basePanel);
        }

        dialog.add(pageLB, BorderLayout.NORTH);
        dialog.add(contentPanel, BorderLayout.CENTER);
        dialog.add(noSongsLB, BorderLayout.SOUTH);
        dialog.setVisible(true);
 	}

 	public static void start() {

 		final int BORDER_X = 600;
		final int BORDER_Y = 400;

		int songTime = 200;
		Object[][] data = {{"Name 1", "Artist 1", new JCheckBox()}, {"Name 2", "Artist 2", new JCheckBox()}, {"Name 3", "Artist 3", new JCheckBox()}, {"Name 4", "Artist 4", new JCheckBox()}};
		Object[] columnHeader = {"Song Name", "Artist Name", "Selected"};

		//frame and panels
		JFrame frame = new JFrame("osu!Player");
		JPanel panel = new JPanel();

		//set layout types
		panel.setLayout(null);

		//component itializations
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenuItem saveItm = new JMenuItem("Save Collections");
		JMenuItem openItm = new JMenuItem("Open osu! Songs");
		JButton collectionBtn = new JButton("Collections");
		JButton songLoopTypeBtn = new JButton("∞");
		JButton infoBtn = new JButton("i");
		JButton playBtn = new JButton("||");
		JButton nextBtn = new JButton(">|");
		JButton lastBtn = new JButton("|<");
		JSlider timeSdr = new JSlider(0, songTime, 0);
		JLabel curTimeLb = new JLabel("0:00");
		JLabel endTimeLb = new JLabel("x:xx");
		JButton imageBtn = new JButton();

		//start frame aspects
		frame.setVisible(true);
		frame.setSize(BORDER_X, BORDER_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//set component location and size
		mb.setBounds(0, 0, BORDER_X, 25);
		collectionBtn.setBounds(BORDER_X - 175, 30, 150, 25);
		songLoopTypeBtn.setBounds(15, BORDER_Y - 100, 50, 50);
		infoBtn.setBounds(BORDER_X - 75, BORDER_Y - 100, 50, 50);
		playBtn.setBounds((BORDER_X / 2) - 30, BORDER_Y - 100, 50, 50);
		nextBtn.setBounds((BORDER_X / 2) + 30, BORDER_Y - 100, 50, 50);
		lastBtn.setBounds((BORDER_X / 2) - 90, BORDER_Y - 100, 50, 50);
		timeSdr.setBounds(95, BORDER_Y - 130, 400, 25);
		curTimeLb.setBounds(50, BORDER_Y - 130, 50, 25);
		endTimeLb.setBounds(512, BORDER_Y - 130, 50, 25);
		imageBtn.setBounds(38, 60, 505, 200);;
		
		//add panel to frame
		frame.add(panel);

		//add components to panel
		fileMenu.add(saveItm);
		fileMenu.add(openItm);
		mb.add(fileMenu);
		mb.add(editMenu);
		panel.add(mb);
		panel.add(collectionBtn);
		panel.add(songLoopTypeBtn);
		panel.add(infoBtn);
		panel.add(playBtn);
		panel.add(nextBtn);
		panel.add(lastBtn);
		panel.add(timeSdr);
		panel.add(curTimeLb);
		panel.add(endTimeLb);
		panel.add(imageBtn);

		
		//finish frame aspects
		frame.setResizable(false);
		frame.setIconImage(new ImageIcon("imageAssests/logo.png").getImage());
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

		//add slider click functionality
		timeSdr.setUI(new MetalSliderUI() {
		    protected void scrollDueToClickInTrack(int direction) {
		        int value = timeSdr.getValue(); 
		        value = this.valueForXPosition(timeSdr.getMousePosition().x);
		        timeSdr.setValue(value);
		    }
		});

		//button action listeners
		collectionBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
		    	openCollections(frame, panel);
			} 
		});
		songLoopTypeBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
		    	changeLoopImage(songLoopTypeBtn);
		    	changeLoopTypeUI();
			} 
		});
		infoBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
		    	openInfo(BORDER_X, BORDER_Y, frame, panel);
			} 
		});
		playBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
		    	pauseOrPlayUI();
			} 
		});
		nextBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
		    	//nextSong(int loopI); //loopI
		    	nextSongUI();
			} 
		});
		lastBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
			    lastSongUI();
			} 
		});
		imageBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				openSongMenu(frame, panel);			    	
			} 
		});
		saveItm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	saveDatabaseUI();
        	}
    	});
		openItm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	String path = openDatabaseUI();
            	if (path != null) {
            		readDatabaseUI(path);
            	}
        	}
    	});
 	}

	public static void main(String[] args) {
		start();		
	}
}