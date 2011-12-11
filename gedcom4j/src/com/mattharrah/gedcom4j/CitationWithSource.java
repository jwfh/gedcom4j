/*
 * Copyright (c) 2009-2011 Matthew R. Harrah
 * 
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */
package com.mattharrah.gedcom4j;

import java.util.ArrayList;
import java.util.List;

/**
 * A citation with a source. Corresponds to the first (preferred) form of the
 * SOURCE_CITATION structure (which you'd do in Pascal with a variant record,
 * but here we use subclasses of a parent abstract class).
 * 
 * @author frizbog1
 * 
 */
public class CitationWithSource extends Citation {
	/**
	 * Where within the source is the information being cited
	 */
	public String whereInSource;
	/**
	 * The quality of this citation. Supposed to be 0, 1, 2, or 3, but stored as
	 * a string since we're not doing math on it.
	 */
	public String certainty;
	/**
	 * The type of event or attribute cited from. Will be the tag from one of
	 * the the following three enum types: {@link FamilyEventType},
	 * {@link IndividualEventType}, {@link IndividualAttributeType}.
	 */
	public String eventCited;
	/**
	 * A list of citation data entries
	 */
	public List<CitationData> data = new ArrayList<CitationData>();
	/**
	 * A reference to the cited source
	 */
	public Source source;
	/**
	 * Notes on this source citation
	 */
	public List<Note> notes = new ArrayList<Note>();
	/**
	 * Multimedia links for this source citation
	 */
	public List<Multimedia> multimedia = new ArrayList<Multimedia>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CitationWithSource other = (CitationWithSource) obj;
		if (certainty == null) {
			if (other.certainty != null) {
				return false;
			}
		} else if (!certainty.equals(other.certainty)) {
			return false;
		}
		if (data == null) {
			if (other.data != null) {
				return false;
			}
		} else if (!data.equals(other.data)) {
			return false;
		}
		if (eventCited == null) {
			if (other.eventCited != null) {
				return false;
			}
		} else if (!eventCited.equals(other.eventCited)) {
			return false;
		}
		if (multimedia == null) {
			if (other.multimedia != null) {
				return false;
			}
		} else if (!multimedia.equals(other.multimedia)) {
			return false;
		}
		if (notes == null) {
			if (other.notes != null) {
				return false;
			}
		} else if (!notes.equals(other.notes)) {
			return false;
		}
		if (source == null) {
			if (other.source != null) {
				return false;
			}
		} else if (!source.equals(other.source)) {
			return false;
		}
		if (whereInSource == null) {
			if (other.whereInSource != null) {
				return false;
			}
		} else if (!whereInSource.equals(other.whereInSource)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
		        + ((certainty == null) ? 0 : certainty.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result
		        + ((eventCited == null) ? 0 : eventCited.hashCode());
		result = prime * result
		        + ((multimedia == null) ? 0 : multimedia.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result
		        + ((whereInSource == null) ? 0 : whereInSource.hashCode());
		return result;
	}
}
