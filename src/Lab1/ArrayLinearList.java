package Lab1;

public class ArrayLinearList <G> {
		public int size=0;
		public ArrayLinearList() {
			
		}
		public boolean empty() {
			if(size() == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		public int size() {
			return size;
		}
		public int getIndex(G[] a, G element) {
			for(int i=0; i < size; i++) {
				if(a[i] == element) {
					return i;
				}
			}
			return -1;
		}
		public G getElement(G[] a, int index) {
			G element;
			element = a[index];
			return element;
		}
		public void add(G[] a, G c) {
		    a[size()] = c;
		    size=size + 1;
		}
		public void print(G[] a) {
			String s = "";
			System.out.print("Jagsaalt : ");
			for(int i=0; i<this.size(); i++) {
				System.out.print( this.getElement(a, i) + " " );
			}
		}
		public void remove(G[] a, int index) {
			for(int i=index; i<size-1; i++) {
				a[i] = a[i+1];
			}
			size = size-1;
		}
	}


