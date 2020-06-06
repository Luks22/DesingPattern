package adapter.exercicio_4_1;

import java.util.HashMap;
import java.util.Map;

public class MapConstructor implements MapAdapter{
	
	private Map map;
	
	public MapConstructor(Object[][] tipos) {
		this.map = new HashMap();
		mapAtributes(tipos);
	}


	@Override
	public void mapAtributes(Object[][] tipos) {
		int count = 0;
		Object[] chave = new Object[tipos[0].length];
		Object[] valor = new Object[tipos[0].length];
		
		for(int i = 0; i < tipos.length; i++) {
			for(int j = 0; j < tipos[i].length; j++) {
				if(count > 0) {
					valor[j] = tipos[i][j];
				}else {
					chave[j] = tipos[i][j];
				}
			}
			count = 0;
		}
		
		for(int i = 0; i<chave.length;i++) {
			this.map.put(chave[i], valor[i]);
		}
	}


	public Map getMap() {
		return map;
	}


	public void setMap(Map map) {
		this.map = map;
	}
	
}
