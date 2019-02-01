package com.earth.tag.dao;

import com.earth.tag.bean.TagInfoBean;

import java.util.List;

public interface TagInfoMapper {
  List<TagInfoBean> getAllTags();

  List<TagInfoBean> fuzzySearchTags(String... keywords);

  void createTag(String tagContent);

  void increaseTagReference(String tagId);
}
