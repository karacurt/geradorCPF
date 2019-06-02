import javax.swing.JOptionPane;
import java.util.Random;
public class geradorcpf {
	public static void main(String[] args) {

Random nums = new Random();
int [] cpf = new int [11];
int j=10,soma=0,v=3;
String resu="";
Object [] menu = {"Sair","Gerar","Validar CPF"};

Object [] numeros = {0,1,2,3,4,5,6,7,8,9};
do{
	
v = JOptionPane.showOptionDialog(null,"Selecione uma opção:","Gerador de numero de CPF 1.0",0,2,null,menu,"");
switch(v){

case 1:
resu="";
soma=0;
j=10;

for(int i=0; i<9; i++){

cpf[i] = nums.nextInt(10);


soma = soma + (cpf[i]*j);
j--;
}
		

if (soma % 11 <=2){
cpf[9]= 0;	
}else{
cpf[9] = 11-(soma % 11) ;
}

j=11;
soma=0;


for(int i=0; i<10; i++){
	
soma = soma + (cpf[i]*j);
j--;
}

if (soma % 11 <=2){
cpf[10]= 0;	
}else{cpf[10] =11-  (soma % 11);}


if (cpf[9]<=9 & cpf[10] <=9){
for(int i=0; i<11;i++){
	resu = resu + cpf[i];
	
	if (i == 2 || i == 5){resu = resu + ".";}	
	if (i == 8){resu = resu + "-";}
	
}

JOptionPane.showMessageDialog(null,"CPF: "+ resu,"Gerador de numero de CPF 1.0",2);
}

break;

case 2:
	
	resu="";
	soma=0;
	j=10;
	
	for(int i=0; i<11; i++){		
		cpf[i] = 0;
	}
	
	for(int i=0; i<9; i++){

		
		cpf[i] = JOptionPane.showOptionDialog(null,"CPF: "+cpf[0]+cpf[1]+cpf[2]+"."+cpf[3]+cpf[4]+cpf[5]+"."+cpf[6]+cpf[7]+cpf[8]+"- XX","Gerador de numero de CPF 1.0",0,2,null,numeros,"");

	soma = soma + (cpf[i]*j);
	j--;
	}
			

	if (soma % 11 <=2){
	cpf[9]= 0;	
	}else{
	cpf[9] = 11-(soma % 11) ;
	}

	j=11;
	soma=0;



for(int i=0; i<10; i++){
	
soma = soma + (cpf[i]*j);
j--;
}

if (soma % 11 <=2){
cpf[10]= 0;	
}else{cpf[10] =11-  (soma % 11);}


if (cpf[9]<=9 & cpf[10] <=9){
	
for(int i=0; i<11;i++){
	resu = resu + cpf[i];	
	if (i == 2 || i == 5){resu = resu + ".";}	
	if (i == 8){resu = resu + "-";}
}
JOptionPane.showMessageDialog(null,"CPF: "+ resu,"Gerador de numero de CPF 1.0",2);
}
	


	
	
	
	
	
	
	
	
	
	
	break;

}
}while(v != 0);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
