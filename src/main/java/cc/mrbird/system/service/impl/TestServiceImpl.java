package cc.mrbird.system.service.impl;

import cc.mrbird.common.domain.TEST;
import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class TestServiceImpl extends BaseService<TEST> implements TestService{

}
