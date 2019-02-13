package com.orangeslate.naturestore.repository;

import com.mongodb.WriteResult;
import com.orangeslate.naturestore.domain.Tree;
import java.util.List;

public interface Repository {
	public Tree getTree(String id);
	public List<Tree> getAllTrees();
	public void dropCollection();
	public void createCollection();
	public void saveTree(Tree tree);
	public void deleteTree(String id);
	public WriteResult updateTree(String id, String name);
}
