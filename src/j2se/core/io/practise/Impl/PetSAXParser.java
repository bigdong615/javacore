package j2se.core.io.practise.Impl;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import j2se.core.io.practise.entity.*;

public class PetSAXParser extends DefaultHandler {
	private List<Dog> dogs = null;
	private Dog dog = null;
	private PetEnumState state = PetEnumState.none;

	public List<Dog> getDogs() {
		return this.dogs;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		dogs = new ArrayList<Dog>();
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {
		if (arg2.equals("dog")) {
			dog = new Dog();
			dog.setId(Integer.parseInt(arg3.getValue("id")));
			return;
		}

		if (arg2.equals("name")) {
			state = PetEnumState.name;
			return;
		}

		if (arg2.equals("health")) {
			state = PetEnumState.health;
		}

		if (arg2.equals("love")) {
			state = PetEnumState.love;
		}

		if (arg2.equals("strain")) {
			state = PetEnumState.strain;
		}
	}

	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub
		if (state == PetEnumState.none)
			return;
		String context = new String(arg0, arg1, arg2);
		switch (state) {
		case name:
			dog.setName(context);
			state = PetEnumState.none;
			break;
		case health:
			dog.setHealth(Integer.parseInt(context));
			state = PetEnumState.none;
			break;
		case love:
			dog.setLove(Integer.parseInt(context));
			state = PetEnumState.none;
			break;
		case strain:
			dog.setStrain(context);
			state = PetEnumState.none;
			break;

		}
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {
		// TODO Auto-generated method stub
		if (arg2.equals("dog")) {
			dogs.add(dog);
			dog = null;
		}
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

}
