package com.maxmayr.awesomegreenspacebackend.listenere;

import org.springframework.data.domain.PageRequest;

public class PageUtil {
	private PageUtil() {
	}

	public static PageRequest getPage(int page, int limit) {
		if (page > 0) {
			return PageRequest.of(page - 1, limit);
		} else {
			return PageRequest.of(0, limit);
		}
	}
}
