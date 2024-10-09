package com.raval.millionary;

public class QuestionEn {
public String mQuestions [] = {
		"Who's the president of Madagascar now??",
		"Aiza no toerana betsaka mpizaha tany eto Madagasikara??",
		
		"who is the prime Minister now?",
		"Repoblika faha-firy isika izao?",
		"Firy ny faritra misy eto Fianaratsoa?",
		"Iza no Renirano farany lava eto madagascar?",
"Lalam-pirenena faha-firy no mampitohy ny tana-fianar-tulear??",
"Iza no mahay baolina indrindra maneratany??",
"Iza no mpanazatra ny barea Can??",
"Tamin'ny taona firy no sambany mba nandray anjara @izany CAN izany ny Barea??",

"Which is the Capital of Madagascar now??",
"Iza no kapiteny vaovao ni BAREA??","Iza no olona farany manakarena eto Madagasikara?","Aiza i Jeremy Morel no milalao any @ligue 1??","T@ny taona firy no nahazo ni fahaleovan-tena i Madagasikara??","Capital economie ny madagasikaraa???","Iza no mpanjaka farany nanjaka teto Madagasikara??","Inona no anarany anime(manga) misy an'ny Madagasikara???"
   
	};
	private String mChoices [][]= {
		{"Rajoelina Andry","Tsiranana Philbert","Rajaonarimampianina hery","Ravalomanana Marc"},
	    {"Isalo","Nosy be","st marie","Ranomafana"},
		{"Tsay Christian","kamy Vital","jean omer belijik","Christine Razanamahasoa"},
		{"faha-3","faha-4","faha-5","faha-2"},
		{"22","2","4","10"},
		{"Onilahy","Matsiatra","Ikopa","Mangoky"},
    {"rn2","rn34","rn7","rn4"},
     {"faneva ima","c.ronaldo","messi","neymar"},
        {"Nicolas dupuis","zinedine zidane","ravoavy paulin","valverde"},
  {"1960","2014","2021","2019"}, {"fianarantsoa","toamasina","antananarivo","atsiranana"},
{"marco Ilaimaharitra","jerome Mombris","Anicet","Faneva Ima"},{"Ravalomanana Marc","Akbaraly","Andry Rajoelina","Mbola Rajaona"},{"Olympic lyonnais","Marseille","OGC Nice","stade rennais"},  {"1960","2014","1947","2019"},{"Antananarivo","Fianarantsoa","Atsiranana","Toamasina"},{"Radama II","Andrianamponimerina","Rasoherina","Ranavalona III"},{"One piece","the king of prisme","peguin de madagascar","Madagascar"}}
;
	private String mCorrectAnsewrs [] = {"Rajoelina Andry","Nosy be",
		"Tsay Christian","faha-4","4","Mangoky","rn7","c.ronaldo","Nicolas dupuis","2019","antananarivo","Anicet","Akbaraly","stade rennais","1960","Toamasina","Ranavalona III","the king of prisme"
	};
	
	public String getQuestion (int a){
		String question= mQuestions[a];
		return question;
	}
	
	public String getChoice1 (int a) {
		String choice = mChoices[a][0];
		return choice;
	}
	public String getChoice2 (int a) {
		String choice1 = mChoices[a][1];
		return choice1;
	}
	public String getChoice3 (int a) {
		String choice2 = mChoices[a][2];
		return choice2;
	}
	public String getChoice4 (int a) {
		String choice3 = mChoices[a][3];
		return choice3;
	}
	public String getCorrectAnsewrs (int a) {
		String answer = mCorrectAnsewrs[a];
		return answer;
	}
    
}
