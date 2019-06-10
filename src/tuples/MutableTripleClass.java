/*
The MIT License:
Copyright (c) 2019, �lvaro Ant�nio Santos

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

class MutableTripleClass<A, B, C> extends MutablePairClass<A, B> implements MutableTriple<A, B, C> {
	private static final long serialVersionUID = 1L;

	private C third;

	public MutableTripleClass() {
		super();
	}

	public MutableTripleClass(final A first, final B second, final C third) {
		super(first, second);
		this.third = third;
	}

	@Override
	public C third() {
		return this.third;
	}

	@Override
	public void third(final C third) {
		this.third = third;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}

		if(other == null) {
			return false;
		}

		if(!(other instanceof Triple)) {
			return false;
		}

		@SuppressWarnings("rawtypes")
		final Triple triple = (Triple) other;

		return triple.first().equals(this.first()) &&
			   triple.second().equals(this.second()) &&
			   triple.third().equals(this.third());
	}

	@Override
	public int hashCode() {
		return super.hashCode() * this.third().hashCode();
	}

	@Override
	public String toString() {
		return "(" + this.first() + ", " + this.second() + ", " + this.third() + ")";
	}
}
