package jsettlers.logic.algorithms.path.astar;

import jsettlers.logic.algorithms.path.IPathCalculateable;
import jsettlers.logic.algorithms.path.Path;

public interface IAStar {

	int getHeapIdx(int elementID);

	void setHeapIdx(int elementID, int idx);

	float getHeapRank(int parentElementID);

	Path findPath(IPathCalculateable requester, final short sx, final short sy, final short tx, final short ty);
}
