package com.modis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.modis.entities.Immagine;
import com.modis.repo.ImmagineRepo;

@SpringBootApplication
public class GalleriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleriaApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(
			ImmagineRepo immagineRepo){
				return new CommandLineRunner() {
	
					@Override
					public void run(String... args) throws Exception {
						
						Immagine i1 = new Immagine("Lago", "https://i.picsum.photos/id/575/200/300.jpg?hmac=sopd2rAqqxeAtI5YKmESfglb3av7FRnaTdo3woj1uEM");
						Immagine i2 = new Immagine("Controller", "https://i.picsum.photos/id/96/200/300.jpg?hmac=q257RPq4_aD8wno1Mkb4eP37WQzxDcNNLPu_HBwKdag");
						Immagine i3 = new Immagine("Campo", "https://i.picsum.photos/id/808/200/300.jpg?hmac=Kyj9_KH7mvVdj6C03HH9933R2yKWSwQHGtqkeaTLCAM");
						Immagine i4 = new Immagine("Deserto", "https://i.picsum.photos/id/551/200/300.jpg?hmac=pXJCWIikY_BiqwhtawBb8x1jxclDny0522ZprZVTJiU");
						Immagine i5 = new Immagine("Cascata", "https://i.picsum.photos/id/1039/200/300.jpg?hmac=6ltGhc0bwc07wl0cbQxDwnJd-vpqJcHZLTO8xm-M15o");
						Immagine i6 = new Immagine("Agiricoltura", "https://i.picsum.photos/id/729/200/300.jpg?hmac=VbcZBxFYzQK1ro1MTLLmwHNQ0kuIJSagOeue4JMymUY");
						Immagine i7 = new Immagine("Montagne", "https://i.picsum.photos/id/547/200/300.jpg?hmac=O1sHSqamP2AYNG_ADzB7uKiGjh_fmg-Xq4v2KEapg_k");
						Immagine i8 = new Immagine("Città", "https://i.picsum.photos/id/61/200/300.jpg?hmac=4gnmCaXyXsOzE8pxb43yUtdfZnVbnUSGdPaJdh-aCUo");
						Immagine i9 = new Immagine("Tram", "https://i.picsum.photos/id/670/200/300.jpg?hmac=Ib58hZuwIQfcFZjEvKKi0p-j4GN1BGIkE7wLsa95Xk4");
						Immagine i10 = new Immagine("Stelle", "https://i.picsum.photos/id/683/200/300.jpg?hmac=LalV5DeTpQsFRVpqJKk0lZ_zRqag95TYBrqTW06L9yw");
						
						Immagine i11 = new Immagine("Alberi", "https://i.picsum.photos/id/568/200/300.jpg?hmac=vQmkZRQt1uS-LMo2VtIQ7fn08mmx8Fz3Yy3lql5wkzM");
						Immagine i12 = new Immagine("Computer", "https://i.picsum.photos/id/0/200/300.jpg?hmac=0pq7Zy79Vy4K-8w1qAMo1ppYmPvl-7lvwSx-LyZ7vNY");
						Immagine i13 = new Immagine("Onde", "https://i.picsum.photos/id/614/200/300.jpg?hmac=xdwLDQeqnqPXVsgZJs7oGV_sNAJTIifS_rwPzeD7x2s");
						Immagine i14 = new Immagine("Parco-panchina", "https://i.picsum.photos/id/553/200/300.jpg?hmac=-A3VLW_dBmwUaXOe7bHhCt-lnmROrPFyTLslwNHVH1A");
						Immagine i15 = new Immagine("Bar", "https://i.picsum.photos/id/42/200/300.jpg?hmac=RFAv_ervDAXQ4uM8dhocFa6_hkOkoBLeRR35gF8OHgs");
						Immagine i16 = new Immagine("Ragnatela", "https://i.picsum.photos/id/784/200/300.jpg?hmac=LIWlcHgxQH79XHKNji8Jin_KakntjYyd9VXyckNYFbE");
						Immagine i17 = new Immagine("Barchetta", "https://i.picsum.photos/id/469/200/300.jpg?hmac=XkjIV9jof2hkk4eUpQpbQVMBiSTfqdlJxIdlcIdEM6Q");
						Immagine i18 = new Immagine("Molo", "https://i.picsum.photos/id/867/200/300.jpg?hmac=l9Sb50fRDDS2EGp1lHYsoxOdsO88E-eRygNU36pTQ-s");
						Immagine i19 = new Immagine("Colori", "https://i.picsum.photos/id/995/200/300.jpg?hmac=eFU8vnJxVDadyN4EfO1gKTmd6m9u3C-jglYq9Gi34ew");
						Immagine i20 = new Immagine("Medusa", "https://i.picsum.photos/id/881/200/300.jpg?hmac=OaIsS2cuxcnUpCVdxcFoc8JwfJgzWEv2Z9F_qEN9tHU");
						
						immagineRepo.save(i1);
						immagineRepo.save(i2);
						immagineRepo.save(i3);
						immagineRepo.save(i4);
						immagineRepo.save(i5);
						immagineRepo.save(i6);
						immagineRepo.save(i7);
						immagineRepo.save(i8);
						immagineRepo.save(i9);
						immagineRepo.save(i10);

						immagineRepo.save(i11);
						immagineRepo.save(i12);
						immagineRepo.save(i13);
						immagineRepo.save(i14);
						immagineRepo.save(i15);
						immagineRepo.save(i16);
						immagineRepo.save(i17);
						immagineRepo.save(i18);
						immagineRepo.save(i19);
						immagineRepo.save(i20);
						
					}
					
				};
		}
	
	
}
