package com.anand.java8.optionalfea;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		
		Optional<Computer> computer = Optional.of(new Computer());
		System.out.println(computer.map(Computer::getSoundCard).map(SoundCard::getUsb).map(USB::getVersion).orElse("V0.1"));	
		
		//		PojoOptional pojo = new PojoOptional(1,"Anand");
//		Optional<PojoOptional> t = Optional.ofNullable(pojo);
//		System.out.println(t.isPresent());
//		//System.out.println(t.get().getId());
//		//t.ifPresent(System.out::println);
//		t.filter(p-> "Anand".equals(p.getName())).ifPresent(System.out::println);
//		
//		//t.ifPresent(System.out::println);

	}
}