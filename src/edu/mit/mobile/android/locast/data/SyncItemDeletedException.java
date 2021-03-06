package edu.mit.mobile.android.locast.data;
/*
 * Copyright (C) 2010  MIT Mobile Experience Lab
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
import android.net.Uri;

/**
 * @author steve
 *
 */
public class SyncItemDeletedException extends SyncException {
	private final Uri item;
	public SyncItemDeletedException(Uri item) {
		super(item + " seems to have been deleted on the server side.");
		this.item = item;
	}
	public Uri getItem() {
		return item;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -7815670868807412611L;

}
