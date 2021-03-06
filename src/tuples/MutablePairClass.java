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

class MutablePairClass<A, B> extends MutableSingleClass<A> implements MutablePair<A, B> {
	private static final long serialVersionUID = 1L;

	private B second;

	public MutablePairClass() {
		super();
	}

	public MutablePairClass(final A first, final B second) {
		super(first);
		this.second = second;
	}

	@Override
	public B second() {
		return this.second;
	}

	@Override
	public void second(final B second) {
		this.second = second;
	}

	@Override
	public boolean equals(Object other) {
		if(other == this) {
			return true;
		}

		if(other == null) {
			return false;
		}

		if(!(other instanceof Pair)) {
			return false;
		}

		@SuppressWarnings("rawtypes")
		final Pair pair = (Pair) other;

		return pair.first().equals(this.first()) &&
			   pair.second().equals(this.second());
	}

	@Override
	public int hashCode() {
		return super.hashCode() * this.second().hashCode();
	}

	@Override
	public String toString() {
		return "(" + this.first() + ", " + this.second() + ")";
	}
}
