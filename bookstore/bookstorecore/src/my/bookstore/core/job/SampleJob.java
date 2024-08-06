package my.bookstore.core.job;

import de.hybris.cronjob.model.SampleCronJobModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

public class SampleJob extends AbstractJobPerformable<SampleCronJobModel> {

    @Override
    public PerformResult perform(SampleCronJobModel sampleCronJobModel) {
        System.out.println("Welcome to SAP");
        if (clearAbortRequestedIfNeeded(sampleCronJobModel))
        {
            System.out.println("The job is aborted");
            return new PerformResult(CronJobResult.ERROR, CronJobStatus.FINISHED);

        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
    @Override
    public boolean isAbortable()
    {
        return true;
    }
}
