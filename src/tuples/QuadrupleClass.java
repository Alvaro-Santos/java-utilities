/*
The MIT License:
Copyright (c) 2019, Álvaro António Santos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package tuples;

class QuadrupleClass<A, B, C, D> extends TripleClass<A, B, C> implements Quadruple<A, B, C, D> {
	private static final long serialVersionUID = 1L;

	private final D fourth;

	public QuadrupleClass(final A first, final B second, final C third, final D fourth) {
		super(first, second, third);
		this.fourth = fourth;
	}

	@Override
	public D fourth() {
		return this.fourth;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}

		if(other == null) {
			return false;
		}

		if(!(other instanceof Quadruple)) {
			return false;
		}

		@SuppressWarnings("rawtypes")
		final Quadruple quadruple = (Quadruple) other;

		return quadruple.first().equals(this.first()) &&
			   quadruple.second().equals(this.second()) &&
			   quadruple.third().equals(this.third()) &&
			   quadruple.fourth().equals(this.fourth());
	}

	@Override
	public int hashCode() {
		return super.hashCode() * this.fourth().hashCode();
	}

	@Override
	public String toString() {
		return "(" + this.first() + ", " + this.second() + ", " + this.third() + ", " + this.fourth() + ")";
	}
}
