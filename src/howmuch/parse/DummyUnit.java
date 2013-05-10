package howmuch.parse;
/**
 * A dummy information unit where a trace is actually an unit used for
 * estiamting the degree of completeness of an event log.
 * @author hedong
 *
 */

public class DummyUnit extends StatClassifierCoverage implements StatRes {
	
	public DummyUnit(EstimatorConfigure config) {
		super(config);
	}
	@Override
	public StringBuffer tracetag(StringBuffer tasks) {
		return tasks;
	}
	
}
